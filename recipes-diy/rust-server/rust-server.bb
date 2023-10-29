DESCRIPTION = "Simple rust opcua server"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8203222432b76e1027275efb06c33384"

SRCREV = "${AUTOREV}"

SRC_URI = "git://git@github.com/hen3u/opcua-server.git;protocol=ssh;branch=main"

inherit cargo

S = "${WORKDIR}/git"
