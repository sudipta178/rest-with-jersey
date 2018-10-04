#!/bin/bash -x

mvn clean install
yes | cp -rf target/rest-with-jersey.war  $CATALINA_HOME/webapps/

