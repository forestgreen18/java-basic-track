@echo off

set SRC_DIR=src
set OUT_DIR=out
set MAIN_CLASS=Main

if not exist %OUT_DIR% (
    mkdir %OUT_DIR%
)

javac -encoding UTF-8 -d %OUT_DIR% -sourcepath %SRC_DIR% %SRC_DIR%\%MAIN_CLASS%.java

if %errorlevel% neq 0 (
    echo Compilation failed. Please check your code.
    pause
    exit /b 1
)

java -cp %OUT_DIR% %MAIN_CLASS%

if %errorlevel% neq 0 (
    echo Execution failed. Please check for errors.
    pause
    exit /b 1
)

echo Program finished successfully.
pause