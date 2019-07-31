#!/usr/bin/env bash
gradle build -x test
docker build -t app4 .
docker tag app4:latest mrudnicki123/amazon-demo:1.0
docker push mrudnicki123/amazon-demo:1.0