FROM airdock/oracle-jdk:1.8
VOLUME /tmp
ADD renren-admin/target/renren-admin.jar app.jar
ENV JAVA_OPTS=" "
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]
