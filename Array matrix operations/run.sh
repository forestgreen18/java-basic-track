#!/bin/bash


SRC_DIR="src"
OUT_DIR="out"
MAIN_CLASS="Main"


mkdir -p $OUT_DIR


javac -d $OUT_DIR $SRC_DIR/com/illiakornyk/matrixoperations/MatrixOperations.java $SRC_DIR/Main.java

if [ $? -ne 0 ]; then
    echo "Compilation failed. Please check your code."
    exit 1
fi

java -cp $OUT_DIR $MAIN_CLASS


if [ $? -ne 0 ]; then
    echo "Execution failed. Please check for errors."
    exit 1
fi
