require custom-core-image.bb

DESCRIPTION = "An extended image of custom-core-image which contains more tools"

IMAGE_INSTALL_append = " \
    packagegroup-test \
    packagegroup-net-extended \
"
