#!/bin/sh
#source ./_env_vacammar.sh
. ./_env_vacammar.sh
java -version
#export MVN_PROFILE=tst-rp-01
export MVN_PROFILE=tst-rp-01
COMMAND="mvn -f ../../pom.xml -e -s $MVN_SETTINGS -Dmaven.test.skip=true -P$MVN_PROFILE clean compile package install"
echo "$COMMAND"
exec $COMMAND











