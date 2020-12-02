#!/bin/sh

source ./_env.sh

java -version

#COMMAND="mvn -f ../../staon-csi/pom.xml -Dtest=ServizioConsultazioneTestCase#testResources test"
COMMAND="mvn -f ../../staon-csi/pom.xml -Dtest=ServizioConsultazioneTestCase test"

#COMMAND="mvn -f ../../staon-csi/pom.xml -Dtest=ServizioConsultazioneTestCase#testResources"

echo "$COMMAND"

exec $COMMAND














