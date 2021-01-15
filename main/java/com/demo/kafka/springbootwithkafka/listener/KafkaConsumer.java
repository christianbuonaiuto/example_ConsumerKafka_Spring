package com.demo.kafka.springbootwithkafka.listener;

import com.demo.kafka.springbootwithkafka.model.Transaction;
import com.demo.kafka.springbootwithkafka.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    //Due Listener in un Consumer
    //Due argomenti e due gruppi diversi con un container diverso


    @KafkaListener(topics = "TOPIC_TEST", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed message: "+message);
    }

    @KafkaListener(topics = "TOPIC_TEST_json", groupId = "group_id", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON message: " + user);
    }



    //test per transaction

    @KafkaListener(topics = "TESTING", groupId= "group_id", containerFactory = "transactionKafkaListenerFactory")
    public void consumeTransactionByCashDesk(Transaction transaction){
        System.out.println("Consumed JSON message: "+ transaction);
    }

    /*@KafkaListener(groupId = "group_id", topicPartitions = @TopicPartition(topic = "TOPIC_TEST", partitionOffsets = @PartitionOffset( partition = "0", initialOffset = "0")))
    public void listenToPartitionWithOffset(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition, @Header(KafkaHeaders.OFFSET) int offset){
        System.out.println("Received message "+ message +" from partition "+ partition+" with offset "+offset);
    }*/
}
