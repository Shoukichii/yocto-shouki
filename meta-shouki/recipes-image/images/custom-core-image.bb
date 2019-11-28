require core-image-minimal.bb

DESCRIPTION = "A image containing linux usefull packages"

UTIL_PACKAGES="\
    sudo \
    coreutils \
    bash \
    bash-completion \
    usbutils \
    flamegraph \
    wpa-supplicant \
    dropbear \
"

IMAGE_INSTALL_append = " \
    packagegroup-core-boot \
    packagegroup-base \
    packagegroup-net-core \
    ${UTIL_PACKAGES} \
"
