#!/usr/bin/env bash
docker run -d -p 5452:5432 --name actor_db -e POSTGRES_USER=actoruser -e POSTGRES_PASSWORD=actor -e POSTGRES_DB=actor_db postgres:14