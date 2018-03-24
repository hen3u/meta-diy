FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://0001-device-tree-overlay-tft35a.patch"

CMDLINE_append = " fbcon=map:10 fbcon=font:ProFont6x11"
