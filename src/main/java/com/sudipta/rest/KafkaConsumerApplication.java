package com.sudipta.rest;

import com.sudipta.rest.service.IKafkaConsumer;
import com.sudipta.rest.service.impl.KafkaMessageConsumer;

public class KafkaConsumerApplication {

    public static void main(String... args) throws Exception {
        try {
            IKafkaConsumer kafkaConsumer = KafkaMessageConsumer.getKafkaConsumer();
            kafkaConsumer.runConsumer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
