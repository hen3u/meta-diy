# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo pkgconfig

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

DEPENDS = "openssl"

# Enable network for the compile task allowing cargo to download dependencies
do_compile[network] = "1"

# how to get rust-server could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/rust-server/0.1.0"
SRC_URI += "git://git@github.com/hen3u/opcua-server.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "43ebc0da39ca085c27a9db614faa09be5687c0a6"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+43ebc0da39"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.21.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.1.2 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.69 \
    crate://crates.io/base64/0.21.5 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.4.1 \
    crate://crates.io/bumpalo/3.14.0 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/1.5.0 \
    crate://crates.io/cc/1.0.83 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.31 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/env_logger/0.10.1 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.8 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/futures-channel/0.3.29 \
    crate://crates.io/futures-core/0.3.29 \
    crate://crates.io/futures-executor/0.3.29 \
    crate://crates.io/futures-io/0.3.29 \
    crate://crates.io/futures-macro/0.3.29 \
    crate://crates.io/futures-sink/0.3.29 \
    crate://crates.io/futures-task/0.3.29 \
    crate://crates.io/futures-util/0.3.29 \
    crate://crates.io/futures/0.3.29 \
    crate://crates.io/gethostname/0.4.3 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/gimli/0.28.0 \
    crate://crates.io/hashbrown/0.14.3 \
    crate://crates.io/hermit-abi/0.3.3 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.58 \
    crate://crates.io/idna/0.1.5 \
    crate://crates.io/indexmap/2.1.0 \
    crate://crates.io/is-terminal/0.4.9 \
    crate://crates.io/itoa/1.0.9 \
    crate://crates.io/js-sys/0.3.64 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.149 \
    crate://crates.io/linux-raw-sys/0.4.12 \
    crate://crates.io/lock_api/0.4.11 \
    crate://crates.io/log/0.4.20 \
    crate://crates.io/matches/0.1.10 \
    crate://crates.io/memchr/2.6.4 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.9 \
    crate://crates.io/num-traits/0.2.17 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/object/0.32.1 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-sys/0.9.93 \
    crate://crates.io/openssl/0.10.57 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.9 \
    crate://crates.io/percent-encoding/1.0.1 \
    crate://crates.io/pin-project-lite/0.2.13 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/proc-macro2/1.0.69 \
    crate://crates.io/quote/1.0.33 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/regex-automata/0.4.3 \
    crate://crates.io/regex-syntax/0.8.2 \
    crate://crates.io/regex/1.10.2 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustix/0.38.21 \
    crate://crates.io/ryu/1.0.15 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/serde/1.0.190 \
    crate://crates.io/serde_derive/1.0.190 \
    crate://crates.io/serde_json/1.0.107 \
    crate://crates.io/serde_yaml/0.9.27 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.11.1 \
    crate://crates.io/socket2/0.5.5 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.38 \
    crate://crates.io/termcolor/1.3.0 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio-util/0.6.10 \
    crate://crates.io/tokio/1.33.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unsafe-libyaml/0.2.10 \
    crate://crates.io/url/1.7.2 \
    crate://crates.io/uuid/1.6.1 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.87 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.87 \
    crate://crates.io/wasm-bindgen-macro/0.2.87 \
    crate://crates.io/wasm-bindgen-shared/0.2.87 \
    crate://crates.io/wasm-bindgen/0.2.87 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.6 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-core/0.51.1 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.0 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.0 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.0 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.0 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.0 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.0 \
    git://github.com/locka99/opcua.git;protocol=https;nobranch=1;branch=master;name=opcua;destsuffix=opcua \
"

SRCREV_FORMAT .= "_opcua"
SRCREV_opcua = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/opcua"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "A simple rust opcua server"
HOMEPAGE = "https://github.com/hen3u/opcua-server"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include rust-server-${PV}.inc
include rust-server.inc
