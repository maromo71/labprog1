if (Test-Path "C:\Users\memar\.jdks\temurin-21.0.12-x64") {
    $env:JAVA_HOME = "C:\Users\memar\.jdks\temurin-21.0.12-x64"
    $env:PATH = "$env:JAVA_HOME\bin;$env:PATH"
}
Write-Host "Iniciando aplicacao JavaFX com Java 21..." -ForegroundColor Cyan
mvn javafx:run
