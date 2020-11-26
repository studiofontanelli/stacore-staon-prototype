#!/bin/sh

source ./_env.sh


java -version

export MVN_PROFILE=prod-rp-01


COMMAND="mvn -f ../../pom.xml -e -s $MVN_SETTINGS -Dmaven.test.skip=true -P$MVN_PROFILE install"

echo "$COMMAND" 

exec $COMMAND 
















