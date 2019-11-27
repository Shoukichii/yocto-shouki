require core-image-minimal.bb

DESCRIPTION = "A image containing linux usefull packages"

UTIL_PACKAGES="\
    sudo \
    coreutils \
    ebtables \
    bash \
    bash-completion \
    usbutils \
    mpd \
    flamegraph \
    wpa-supplicant \
    ssh-server-openssh \
"

IMAGE_INSTALL_append = " \
    packagegroup-core-boot \
    packagegroup-base \
    packagegroup-net \
    ${UTIL_PACKAGES} \
"
