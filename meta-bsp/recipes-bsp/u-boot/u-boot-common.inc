HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "3c99166441bf3ea325af2da83cfe65430b49c066"

SRC_URI = "git://git.denx.de/u-boot.git"

#UBOOT_SRC ?= "git://github.com/123markhong/6UL-5.10uboot.git;protocol=https"
#SRCBRANCH = "6ull-uboot2020.04"
#SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
#"
#SRCREV = "25276d37405151d3f77a900c74f0e19934e8d4aa"


# UBOOT_SRC ?= "git://github.com/MYiR-Dev/myir-imx-uboot.git;protocol=https"
# SRCBRANCH = "develop_2020.04"
# SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
# "
# SRCREV = "ad7247c8820b36396cd34331dc40e8cd60aabef0"

UBOOT_SRC ?= "git://github.com/Assistr/myir-imx-uboot.git;protocol=https"
SRCBRANCH = "assistme-dev"
#SRCBRANCH = "develop_2020.04"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
"
#SRCREV = "ad7247c8820b36396cd34331dc40e8cd60aabef0"
SRCREV = "85d8b1f25414561751474d35d584737a313e0404"
S = "${WORKDIR}/git"
