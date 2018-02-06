FROM Openjdk:8
ADD target/bestbuyapp.jar bestbuyapp.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "bestbuybpp.jar"]



