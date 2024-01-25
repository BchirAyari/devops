FROM openjdk:11

ADD target/timesheet-devops-1.0.jar timesheet-devops-1.0.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/timesheet-devops-1.0.jar"]