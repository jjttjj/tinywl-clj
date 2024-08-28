# tinywl-clj

A Clojure port of [tinywl](https://gitlab.freedesktop.org/wlroots/wlroots/-/tree/master/tinywl), a minimal viable Wayland compositor using the [wlroots](https://gitlab.freedesktop.org/wlroots/wlroots/) library.

Uses Java 22's java.lang.foreign library (aka [Project Panama](https://openjdk.org/projects/panama/)) to interop with wlroots and other C libraries from Clojure.

Java bindings were generated using [jextract](https://github.com/openjdk/jextract).

The goal of this project was to personally learn about the above technologies, and as a proof of concept of porting an (at least slightly) nontrivial program from C to Clojure. Tinywl itself makes no claim to be actually useful as a Wayland compositor.

# Prerequisites

- Java 22
- Clojure 1.12-rc1
- wlroots 0.18 (and all it's dependencies) installed.
- Linux

# Usage

If you are using Wayland currently you can try out tinywl-clj, it will open a new window inside your existing compositor.

There are several ways to build and run tinywl-clj.

For all the below options you must clone this repo and cd into it.

```shell
git clone https://github.com/jjttjj/tinywl-clj
cd tinywl-clj
```

## Container usage

The `:podman` alias also offers some helper commands to build and run tinywl-clj using podman (which you must have installed)

```shell
# arch
clj -X:podman build :file '"build/Dockerfile.arch"' :tag '"tinywl-clj:arch"'
clj -X:podman run :tag '"tinywl-clj:arch"'

# debain
clj -X:podman build :file '"build/Dockerfile.debian"' :tag '"tinywl-clj:debian"'
clj -X:podman run :tag '"tinywl-clj:debian"'
```

## Nix
```shell
nix develop
clojure -T:build
clojure -M -m dev.jt.tinywl-clj -s foot
```

## Native usage

To use tinywl-clj natively you will need to have wlroots installed on your system. Your distro might have some wlroots package that might get you a long way there. A sign that you're ready to go would be that `libwlroots-0.18.0.so` is in one of the directories on your `LD_LIBRARY_PATH`.

```shell
clojure -M -m dev.jt.tinywl-clj -s foot
clojure -T:build
clojure -M -m dev.jt.tinywl-clj -s foot

```
