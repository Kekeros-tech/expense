@echo off
setlocal

:: ================= Settings =================
if not defined APP_JAR (
    set "APP_JAR=target\expense-0.0.1-SNAPSHOT.jar"
)
set "JAVA_OPTS=-Xms512m -Xmx1024m -XX:+UseG1GC -Dfile.encoding=UTF-8"
:: =============================================
cd /d "%~dp0"

java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo [ERROR] Java не установлена или не добавлена в PATH.
    pause
    exit /b 1
)

if not exist "%APP_JAR%" (
    echo [ERROR] JAR file '%APP_JAR%' was not found
    pause
    exit /b 1
)

echo.
echo ==========================================
echo [INFO] Start Spring application...
echo [INFO] PATH: %APP_JAR%
echo ==========================================
echo.

java %JAVA_OPTS% ^
     -jar "%APP_JAR%"

if %errorlevel% neq 0 (
    echo [ERROR] The application exited with the code %errorlevel%.
    pause
) else (
    echo [INFO] The application stopped correctly.
    pause
)

endlocal