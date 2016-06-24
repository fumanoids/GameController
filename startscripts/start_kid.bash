#!/bin/bash

cd `dirname $0`
set -eu

java -jar GameController.jar --league hl_kid
