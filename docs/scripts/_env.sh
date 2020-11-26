#! /bin/sh

#########################################
###### ambiente JDK 1.8+ JBOSS-EAP 6.4.0
#########################################

export JBOSS_HOME=/opt/java/jboss-eap-6.4.0
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_71.jdk/Contents/Home/

#export MVN_HOME=/opt/java/apache-maven-3.0.4
export MVN_HOME=/opt/java/apache-maven-3.6.0



export MVN_SETTINGS=$MVN_HOME/conf/settings.xml

#export MVN_SETTINGS=$MVN_HOME/conf/settings-mirroring.xml
#export MVN_SETTINGS=$MVN_HOME/conf/settings-csi.xml
#export MVN_SETTINGS=$MVN_HOME/conf/settings-vpn.xml


export PATH=$JAVA_HOME/bin:$MVN_HOME/bin:$PATH