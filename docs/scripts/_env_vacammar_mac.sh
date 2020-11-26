#! /bin/sh
#########################################
###### ambiente JDK 1.8+ JBOSS-EAP 6.4.0
#########################################
export JBOSS_HOME=/Users/valerio/jboss-eap-6.4-stawap/
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk//Contents/Home/
export MVN_HOME=/Users/valerio/apache-maven-3.5.0
export MVN_SETTINGS=$MVN_HOME/conf/settings-csi.xml
export PATH=$JAVA_HOME/bin:$MVN_HOME/bin:$PATH
echo $MVN_SETTINGS
