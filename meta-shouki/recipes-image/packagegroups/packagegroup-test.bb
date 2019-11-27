SUMMARY = "Package group used for test"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

PACKAGES = "${PN}-core"

RDEPENDS_${PN}-core = "\
    stress-ng \
    iperf3 \
    lmbench \
"
