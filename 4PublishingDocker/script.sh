#!/usr/bin/env bash
gradle build
docker build -t app .
docker tag app:latest mrudnicki123/amazon-demo:1.0
docker push mrudnicki123/amazon-demo:1.0