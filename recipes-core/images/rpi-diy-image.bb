# Base this image on core-image-base
include recipes-core/images/core-image-base.bb

IMAGE_FEATURES += '\
    ssh-server-openssh \
    '
