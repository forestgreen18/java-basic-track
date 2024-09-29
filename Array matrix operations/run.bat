@echo off


set SRC_DIR=src
set OUT_DIR=out
set MAIN_CLASS=Main

if not exist %OUT_DIR% (
    mkdir %OUT_DIR%
)

javac -d %OUT_DIR% %SRC_DIR%\com\illiakornyk\matrixoperations\MatrixOperations.java %SRC_DIR%\Main.java

if %errorlevel% neq 0 (
    echo Compilation failed. Please check your code.
    exit /b 1
)

java -cp %OUT_DIR% %MAIN_CLASS%

if %errorlevel% neq 0 (
    echo Execution failed. Please check for errors.
    exit /b 1
)

echo Program finished successfully.
