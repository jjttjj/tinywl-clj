# tinywl-clj

A Clojure port of [tinywl](https://gitlab.freedesktop.org/wlroots/wlroots/-/tree/master/tinywl), a minimal viable Wayland compositor using the [wlroots](https://gitlab.freedesktop.org/wlroots/wlroots/) library.

Uses Java 22's java.lang.foreign library (aka [Project Panama](https://openjdk.org/projects/panama/)) to interop with wlroots and other C libraries from Clojure.

Java bindings were generated using [jextract](https://github.com/openjdk/jextract).

The goal of this project was to personally learn about the above technologies, and as a proof of concept of porting an (at least slightly) nontrivial program from C to Clojure. Tinywl itself makes no claim to be actually useful as a Wayland compositor.

# Prerequisites

- Java 22
- Clojure 1.12-rc1
- wlroots 0.17 (native)
- Linux

# Usage

If you are using Wayland currently you can try out tinywl-clj, it will open a new window inside your existing compositor.

You can either use native shared libraries installed on your system or using the provided Dockerfile with a container tool like Docker or Podman.

## Container usage

To use from within a container you will need to allow your container to access your display. The following should work:

```shell
git clone https://github.com/jjttjj/tinywl-clj
cd tinywl-clj
podman build -t tinywl-clj-arch .
podman run --rm --security-opt label=disable -e XDG_RUNTIME_DIR=/tmp -e "WAYLAND_DISPLAY=$WAYLAND_DISPLAY" -v "$XDG_RUNTIME_DIR/$WAYLAND_DISPLAY:/tmp/$WAYLAND_DISPLAY:ro" --ipc host -it tinywl-clj-arch

```


The `:podman` alias also offers some helper commands for this
```
# arch
clj -X:podman build :file '"build/Dockerfile.arch"' :tag '"tinywl-clj:arch"'
clj -X:podman run :tag '"tinywl-clj:arch"'

# debain
clj -X:podman build :file '"build/Dockerfile.debian"' :tag '"tinywl-clj:debian"'
clj -X:podman run :tag '"tinywl-clj:debian"'
```

## Native usage

To use tinywl-clj natively you will need to have wlroots installed on your system. Your distro might have some wlroots package that might get you a long way there. A sign that you're ready to go would be that `libwlroots.so` is on your `LD_LIBRARY_PATH`.

```shell
git clone https://github.com/jjttjj/tinywl-clj
cd tinywl-clj
clojure -M -m dev.jt.tinywl-clj -s foot
```
(foot is a terminal emulator, replace with any program you want to initially spawn in the new compositor)

I spent some time trying to package these dependencies in a way that would be easier to use and more familiar to Clojure users but have not yet succeeded.
