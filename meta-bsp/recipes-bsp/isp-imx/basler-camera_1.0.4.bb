# Copyright 2020 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

inherit fsl-eula-unpack systemd

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "127a9ddc8a15622537fa6434f5e8e91a"
SRC_URI[sha256sum] = "647e6f1fedf5dfc5b5709eac8fcb660de489b7faa5b7808b73826296e3189cdd"

SYSTEMD_SERVICE_${PN} = "imx8-isp.service"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
      install -d ${D}${systemd_system_unitdir}
      install -m 0644 ${S}/opt/imx8-isp/bin/imx8-isp.service ${D}${systemd_system_unitdir}
    fi
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES_${PN} = "${libdir} /opt ${systemd_system_unitdir}/imx8-isp.service"
INSANE_SKIP_${PN} = "file-rdeps already-stripped"