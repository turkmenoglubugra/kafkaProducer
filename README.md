Start Zookeeper
---------------
D:\kafka\bin\windows>zookeeper-server-start.bat ..\..\config\zookeeper.properties

Start Kafka Server
-----------
D:\kafka\bin\windows>kafka-server-start.bat ..\..\config\server.properties

Start Producer
--------------
D:\kafka\bin\windows>kafka-console-producer.bat --broker-list localhost:9092 --topic NewTopic

Start Consumer
--------------
D:\kafka\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9093 --topic topic10

List / Describe Consumer Groups
----------------
D:\kafka\bin\windows>kafka-consumer-groups.bat --bootstrap-server localhost:9093 --list
D:\kafka\bin\windows>kafka-consumer-groups.bat --bootstrap-server localhost:9093 --describe --group console-consumer-61287

Create / Describe / Delete  Topic
------------
D:\kafka\bin\windows>kafka-topics.bat --bootstrap-server localhost:9093  --partitions 10 --replication-factor 2 --create --topic topic10
D:\kafka\bin\windows>kafka-topics.bat --bootstrap-server localhost:9093 --describe --topic topic10
D:\kafka\bin\windows>kafka-topics.bat --bootstrap-server localhost:9093 --delete --topic topic1
