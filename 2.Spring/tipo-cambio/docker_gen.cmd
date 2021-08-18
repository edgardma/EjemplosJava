docker build -t spring-boot:1.0 .
docker run -d -p 8080:8080 -t spring-boot:1.0