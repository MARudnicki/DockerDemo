#!/usr/bin/env bash
gradle build -x test
docker build -t app0 .
docker run -p 8000:8080 -d app0