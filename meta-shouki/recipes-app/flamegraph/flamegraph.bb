SUMMARY = "Flamegrah Yocto recipe"
DESCRIPTION = "Flamegraph are a visualization tool for profiled application logs"
LICENSE = "CLOSED"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/brendangregg/FlameGraph.git;protocol=https"
SRCREV = "1b1c6deede9c33c5134c920bdb7a44cc5528e9a7"

RDEPENDS_flamegraph = "perl"

FILES_${PN} += "/opt/flamegraph/"

do_install() {
    install -d  ${D}/opt/flamegraph
    install -m  0755 ${S}/*.pl ${D}/opt/flamegraph
}

