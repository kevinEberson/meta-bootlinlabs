SUMMARY = "Bootlin labs core image with debug tool and features enabled"

require bootlinlabs-image-minimal.bb

IMAGE_FEATURES += "dbg-pkgs"
IMAGE_INSTALL += "packagegroup-core-tools-debug"
