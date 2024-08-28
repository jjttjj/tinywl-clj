{
  description = "tinywl-clj dev setup";

  inputs.nixpkgs.url = "github:NixOS/nixpkgs/nixpkgs-unstable";

  outputs = { self, nixpkgs }:
    let
      javaVersion = 22;
      overlays = [
        (final: prev: rec {
          jdk = prev."jdk${toString javaVersion}";
          clojure = prev.clojure.override { inherit jdk; };
          wlroots = prev.wlroots.overrideAttrs (oldAttrs: rec {
            # the wlroots pkg nests the headers under include/wlroots-0.18
            # when we need it just to be under wlroots-0.18
            postInstall = ''
              mkdir -p $out/include
              mv $out/include/wlroots-0.18/* $out/include/
              rmdir $out/include/wlroots-0.18
            '';
          });
        })
      ];
      supportedSystems = [ "x86_64-linux" "aarch64-linux" ];
      forEachSupportedSystem = f: nixpkgs.lib.genAttrs supportedSystems (system: f {
        pkgs = import nixpkgs { inherit overlays system; };
      });
    in
      {
        devShells = forEachSupportedSystem ({ pkgs }: {
          default = pkgs.mkShell {
            packages =
              [
                pkgs.jdk22
                pkgs.clojure
              ];

            buildInputs = [
              pkgs.wlroots
              pkgs.wayland
              pkgs.wayland-protocols
            ];
            nativeBuildInputs = [ pkgs.pkg-config ];
            inputsFrom = [
              pkgs.wlroots
              pkgs.wayland-protocols
            ];
            env.LD_LIBRARY_PATH =
              pkgs.lib.makeLibraryPath
                [
                  pkgs.wlroots
                  pkgs.wayland
                  pkgs.wayland-protocols
                ];

          };
        });
      };
}
