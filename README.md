
# meta-bootlinlabs
Yocto meta layer made according to the specs of the bootlin "Yocto Project and OpenEmbedded development course"

This README file contains information on the contents of the meta-bootlinlabs layer.

Please see the corresponding sections below for details.

Dependencies
============

Poky:
  URI: https://git.yoctoproject.org/git/poky
  \branch: kirkstone-4.0.5

meta-ti:
  URI: https://git.yoctoproject.org/git/meta-ti
  \commit id: 2a5a0339d5bd28d6f6aedaf02a6aaa9b73a248e4
  
meta-arm:
  URI: https://git.yoctoproject.org/git/meta-arm
  \branch: yocto-4.0.1

Patches
=======

Please submit any patches against the meta-bootlinlabs via a pull request in this github repo

Table of Contents
=================

  I. Adding the meta-bootlinlabs layer to your build\
 II. Misc


I. Adding the meta-bootlinlabs layer to your build
=================================================

Run `bitbake-layers add-layer meta-bootlinlabs`


II. Misc
========

This layer was tested using the Beaglebone Black, running Kirkstone version 4.0.5. Other hardware platfroms are not supported out of the box, but can be added by creating and/or modifying machine configuration. Use this layer at your own risk, the software is provided "as is". This layer was created as a learning opportunity and open-sourced in hope that it may be usefull to others.
