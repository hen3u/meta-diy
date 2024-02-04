# Enable network for the compile task allowing cargo to download dependencies
do_compile[network] = "1"

inherit pkgconfig

DEPENDS += "openssl"

RDEPENDS:${PN} += "\
    libcrypto \
"

LICENSE = "MIT"
