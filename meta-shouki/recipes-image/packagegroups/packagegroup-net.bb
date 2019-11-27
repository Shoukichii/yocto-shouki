SUMMARY = "Package group for net tools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

PACKAGES = "${PN}-core ${PN}-extended ${PN}-server"

RDEPENDS_${PN}-core = " \
    iproute2 \
    inetutils \
    bridge-utils \
    iptables \
    tcpdump \
"
RDEPENDS_${PN}-extended = " \
    curl \
    wget \
    bind \
    dhcp-client \
    ntpdate \
    xinetd \
    lsof \
    ${PN}-core \
"
