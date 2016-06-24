#!/bin/bash

cd `dirname $0`
set -eu

java -jar GameStateVisualizer.jar -l hl_teen
