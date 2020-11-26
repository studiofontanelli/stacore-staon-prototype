#! /bin/sh
#########################################
###### ambiente JDK 1.8+ JBOSS-EAP 6.4.0
#########################################
export JBOSS_HOME=/home/vacammar/application-server/jboss-eap-6.4-stawap/
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64/
export MVN_HOME=/home/vacammar/apache-maven-3.5.4
export MVN_SETTINGS=$MVN_HOME/conf/settings-csi.xml
export PATH=$JAVA_HOME/bin:$MVN_HOME/bin:$PATH
echo $MVN_SETTINGS
