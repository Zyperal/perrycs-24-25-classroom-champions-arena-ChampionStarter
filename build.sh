#!/bin/bash
mkdir -p bin
javac -cp champions-arena.jar -d dist $(find src -name "*.java")
