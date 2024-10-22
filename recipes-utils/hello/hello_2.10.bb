LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "${GNU_MIRROR}/hello/hello-${PV}.tar.gz \
           file://0001-Changed-the-greeting-message.patch \
           "

SRC_URI[md5sum] = "6cd0ffea3884a4e79330338dcc2987d6"
SRC_URI[sha1sum] = "f7bebf6f9c62a2295e889f66e05ce9bfaed9ace3"
SRC_URI[sha256sum] = "31e066137a962676e89f69d1b65382de95a7ef7d914b8cb956f41ea72e0f516b"
SRC_URI[sha384sum] = "3ba72897cfb76d572423afca9f689e1503c4656bb04a670d3b9a950e88df71551b46917bbe71fc3271970157eeb02bcb"
SRC_URI[sha512sum] = "e301d785135c52575a8b4c35994c0316f8d366451f604eb5e74c1f907077502aebd5a1a32cd1e26cd7ca32c22f4de5623a335f8ae7e735ac977420df664f01de"

inherit gettext autotools-brokensep

