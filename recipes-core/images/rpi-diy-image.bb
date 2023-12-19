# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += '\
    ssh-server-openssh \
    '

IMAGE_INSTALL += '\
    rust-server \
    '
