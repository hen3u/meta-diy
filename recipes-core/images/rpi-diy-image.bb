inherit core-image

IMAGE_FEATURES += "splash"
IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL:append = " rust-server"
