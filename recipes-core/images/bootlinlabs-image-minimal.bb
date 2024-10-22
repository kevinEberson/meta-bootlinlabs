SUMMARY = "Bootlin labs core image minimal without debugtools"
LICENSE = "MIT"

IMAGE_LINGUAS = ""

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_FSTYPES = "tar.gz"

IMAGE_INSTALL = "packagegroup-core-boot packagegroup-core-ssh-dropbear packagegroup-bootlinlabs-games"

inherit core-image
