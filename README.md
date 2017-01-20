# spring-boot-sample




mvn clean  spring-boot:run もしくは
mvn clean package &&  java -jar target/spring-boot-sample-0.0.1-SNAPSHOT.jar

で Tomcatが起動します。


curl localhost:8080/hello -G -v
curl localhost:8080/hello -X POST -v
curl localhost:8080/hello -X PUT -v

で疎通確認できます。