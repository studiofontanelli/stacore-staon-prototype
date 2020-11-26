#!/bin/sh
source ./_env_vacammar_mac.sh
java -version
export MVN_PROFILE=vacammar
COMMAND="mvn -f ../../pom.xml -e -s $MVN_SETTINGS -Dmaven.test.skip=true -P$MVN_PROFILE clean compile package install"
echo "$COMMAND"
exec $COMMAND 












