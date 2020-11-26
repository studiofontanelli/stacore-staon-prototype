#!/bin/sh

source ./_env.sh


java -version

export MVN_PROFILE=dev-rp-01

# mvn -f ../../pom.xml -s $MVN_SETTINGS -Dmaven.test.skip=true -P$MVN_PROFILE clean package

COMMAND="mvn -f ../../pom.xml -e -s $MVN_SETTINGS -Dmaven.test.skip=true -P$MVN_PROFILE clean compile package"

echo "$COMMAND" 

exec $COMMAND 














