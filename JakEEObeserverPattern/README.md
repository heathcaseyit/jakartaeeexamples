# Build
mvn clean package && docker build -t com.heathcasey/JakEEObeserverPattern .

# RUN

docker rm -f JakEEObeserverPattern || true && docker run -d -p 8080:8080 -p 4848:4848 --name JakEEObeserverPattern com.heathcasey/JakEEObeserverPattern 