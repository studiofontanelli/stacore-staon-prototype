#!/bin/sh

source ./_env.sh

java -version

COMMAND="mvn -f ../../staon-csi/pom.xml -Dtest=ServizioConsultazioneTestCase#testResources test"

echo "$COMMAND"

exec $COMMAND














