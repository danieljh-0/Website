cd Website
# Build project
.\gradlew :app:build

# Start Spring Boot in background
Start-Process powershell -ArgumentList "-NoExit", "-Command", ".\gradlew :app:bootRun"

# Wait 10 seconds
Start-Sleep -Seconds 4

# Open Edge
Start-Process "C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe" "http://localhost:8080/"