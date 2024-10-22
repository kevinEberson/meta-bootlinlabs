SUMMARY = "nInvaders, a space invaders clone"
DESCRIPTION = "A space invaders clone that runs in the terminal using ncurses"
HOMEPAGE = "https://ninvaders.sourceforge.net/"
SECTION = "games"

DEPENDS = "ncurses"
RDEPENDS:${PN} = "ncurses"

LICENSE = "GPL-1.0-only"
SRC_URI = "https://sourceforge.net/projects/${BPN}/files/${BPN}/${PV}/${BPN}-${PV}.tar.gz"

CFLAGS = "-fcommon"
EXTRA_OEMAKE = "-e"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/nInvaders ${D}${bindir}
}
    
