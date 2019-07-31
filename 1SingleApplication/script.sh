#!/usr/bin/env bash
gradle build -x test
docker build -t app .
docker run -p 8080:8080 -d app