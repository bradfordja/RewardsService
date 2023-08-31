
### Using Spring Initializr Web Interface:

## Go to Spring Initializr
## Select:
    Project: Maven Project
    Language: Java
    Spring Boot Version: 2.5.x or any other stable version.
## Fill the fields under "Project Metadata":
    Group: com.retailer.rewards
    Artifact: RetailerRewardsApp
## Add Dependencies: Search and add "Spring Web" to select the web dependency.
## Click "Generate" and download the zip file.
## Extract the zip and import it into your IDE as a Maven project.


# uses url to test API
```bash
http://localhost:8080/api/rewards
```

# uses command to start API
```bash
./mvnw spring-boot:run
```