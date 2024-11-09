#!/bin/bash

SRC_DIR="src"
OUT_DIR="out"
MAIN_CLASS="Main"
STRING_PACKAGE="com/illiakornyk/student"
STRING_CLASS="Student"

# Create output directory
mkdir -p $OUT_DIR

# Compile Java files
javac -d $OUT_DIR $SRC_DIR/$STRING_PACKAGE/$STRING_CLASS.java $SRC_DIR/$MAIN_CLASS.java

if [ $? -ne 0 ]; then
    echo "Compilation failed. Please check your code."
    exit 1
fi

# Run the main class
java -cp $OUT_DIR $MAIN_CLASS

if [ $? -ne 0 ]; then
    echo "Execution failed. Please check for errors."
    exit 1
fi
