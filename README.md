Datapipeline using Springboot Apache Kafka to stream data from Wikimedia. 

The project is used to demonstrate how to stream recent changes in Wikipedia using Apache kafka and store in a MySQL database. 
1. Wikimedia stream generates a stream of recent changes in wikipedia(https://wikitech.wikimedia.org/wiki/Stream.wikimedia.org) (https://stream.wikimedia.org/v2/stream/recentchange)
2. Create two microservices using spring boot application:
    a. Producer that collects the recent changes from the wikimedia stream and publishes to a topic. 
    b. Consumer that subscribes to the same topic and pulls the messages and then stores in a RDBMS such as MySQL.
3. Apache zoo keeper is used to run the Apache Kafka cluster and manage the configurations. (https://kafka.apache.org/quickstart)
4. Kafka is used as a messaging system to exchange messages between these two microservices. 
5. MySQL workbench is used as visual tool for viewing the stored records in the MySQL database. 

Here is a high level architecture of this project:
![Kafka_Architecture](https://github.com/shivshankarm/wikimedia_stream/assets/132717412/c0c595dc-94fc-4576-a3b7-6dd271e3a8d4)

Steps:
1. Run Apache Zoo Keeper: 
2. Run Kafka Producer: https://github.com/shivshankarm/wikimedia_stream/tree/main/springboot-kafka-wikimedia/kafka-producer-wikimedia/src/main/java/net/javaguides/sprintboot
3. Run Kafka Consumer: https://github.com/shivshankarm/wikimedia_stream/tree/main/springboot-kafka-wikimedia/kafka-consumer-database/src/main/java/net/javaguides/springboot
4. View the stored records using MySQL workbench. 


