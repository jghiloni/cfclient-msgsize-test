# cfclient-msgsize-test

## Build

`mvn clean package`

## Deploy

`cf push msg-test -p target/cfclient-msgsize-test-0.0.1-SNAPSHOT.jar`

## Use

`curl http://msg-test.<APPS_DOMAIN>/msg/<LENGTH>`
