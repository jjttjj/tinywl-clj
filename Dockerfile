FROM archlinux:latest

RUN pacman -Syu --noconfirm \
    jdk-openjdk \
    clojure \
    wlroots0.17 \
    git \
    curl \
    wget \
    foot \
    fontconfig \
    ttf-dejavu \
    glibc \
    && pacman -Scc --noconfirm

RUN ln -s /usr/lib/wlroots0.17/libwlroots.so /usr/lib/libwlroots.so

ENV JAVA_HOME=/usr/lib/jvm/default
ENV PATH=$JAVA_HOME/bin:$PATH

WORKDIR /app

COPY . /app/tinywl-clj
WORKDIR /app/tinywl-clj

RUN clojure -X:deps prep

CMD ["clojure", "-M", "-m", "dev.jt.tinywl-clj", "-s", "foot"]
