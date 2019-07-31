#!/usr/bin/env bash
gradle build -x test
docker build -t app2 .
docker run -p 8000:8080 -v /Users/maciejru/amazon_side_projects/DockerDemo/3CommunicationWithDocker/test.txt:/tmp/test.txt app2