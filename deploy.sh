#!/bin/bash -x

mvn clean install
yes | cp -rf target/rest-with-jersey.jar  $CATALINA_HOME/webapps/
$CATALINA_HOME/bin/shutdown.sh
$$CATALINA_HOME/bin/startup.sh
java -jar target/rest-with-jersey.jar

