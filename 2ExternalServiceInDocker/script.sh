#!/usr/bin/env bash
docker run -p 5432:5432 -e POSTGRES_USER=root -e POSTGRES_PASSWORD=root -e POSTGRES_DB=mydb postgres:11