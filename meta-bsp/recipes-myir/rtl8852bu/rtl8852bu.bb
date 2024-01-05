SUMMARY = "RTL8852BU kernel driver (wifi)"
DESCRIPTION = "RTL8852BU kernel driver (like RTL8812BU)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"
DEPENDS = "virtual/kernel"

inherit module

SRCREV = "07c1e69be9fdc785eaac56d444f85f04432a6f3f"
SRC_URI = " \
	git://git@github.com:/Assistr/rtl8852bu.git;protocol=ssh;branch=1.19.3 \
  file://0001-Fix-Makefile.patch \
"
PV = "1.19.3-git"

KERNEL_MODULE_AUTOLOAD += "rtl8852bu"

S = "${WORKDIR}/git"
EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"
RPROVIDES_${PN} += "kernel-module-rtl8852bu"