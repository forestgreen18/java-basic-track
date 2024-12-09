#!/bin/bash

SRC_DIR="src"
OUT_DIR="out"
MAIN_CLASS="Main"

# Create the output directory if it doesn't exist
if [ ! -d "$OUT_DIR" ]; then
    mkdir -p "$OUT_DIR"
fi

# Compile all Java files, starting from Main.java, and resolve dependencies
javac -encoding UTF-8 -d "$OUT_DIR" -sourcepath "$SRC_DIR" "$SRC_DIR/$MAIN_CLASS.java"

# Check if the compilation was successful
if [ $? -ne 0 ]; then
    echo "Compilation failed. Please check your code."
    exit 1
fi

# Run the compiled program
java -cp "$OUT_DIR" "$MAIN_CLASS"

# Check if the program execution was successful
if [ $? -ne 0 ]; then
    echo "Execution failed. Please check for errors."
    exit 1
fi

echo "Program finished successfully."
