FROM airdock/oracle-jdk:1.8
VOLUME /tmp
ADD renren-admin/target/renren-admin.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar app.jar" ]
