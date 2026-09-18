@echo off
setlocal
if exist "C:\Users\memar\.jdks\temurin-21.0.12-x64" (
    set "JAVA_HOME=C:\Users\memar\.jdks\temurin-21.0.12-x64"
    set "PATH=%JAVA_HOME%\bin;%PATH%"
)
echo Iniciando aplicacao JavaFX com Java 21...
mvn javafx:run
pause
