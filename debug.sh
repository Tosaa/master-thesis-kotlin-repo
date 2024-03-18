#!/bin/bash
set -e
JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005" "$@"
