* Override Config like **port** mentioning in ```
src/main/resources/application.properties ```

* After separate server is created (in separate repo) for getting config we renamed ```application.properties``` to ```bootstrap.properties```

* Third repo named eureka-service is then created.
This service discovery repo is now configured in main project as service discovery client  saying ```@EnableDiscoveryClient```
