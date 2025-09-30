@echo off
set DIR=%~dp0
set GRADLE_WRAPPER_JAR=%DIR%gradle\wrapper\gradle-wrapper.jar
java -jar "%GRADLE_WRAPPER_JAR%" %*
