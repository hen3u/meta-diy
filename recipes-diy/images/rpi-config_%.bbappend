do_deploy_append() {
    echo "dtparam=spi=on" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=tft35a" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
