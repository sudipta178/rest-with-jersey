package com.sudipta.rest.service.impl;

import com.sudipta.rest.config.KafkaConfig;
import com.sudipta.rest.service.IKafkaConsumer;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;

public class KafkaMessageConsumer implements IKafkaConsumer {

    private static final Consumer<Long, String> consumer = KafkaConfig.getKafkaConsumer();

    private static IKafkaConsumer kafkaConsumer = null;

    private KafkaMessageConsumer() {}

    public static IKafkaConsumer getKafkaConsumer() {
        if (null == kafkaConsumer) {
            kafkaConsumer = new KafkaMessageConsumer();
        }
        return kafkaConsumer;
    }

    @Override
    public void runConsumer() {
        final int giveUp = 100;
        int noRecordsCount = 0;

        while (true) {
            final ConsumerRecords<Long, String> consumerRecords = consumer.poll(1000);

            if (consumerRecords.count() == 0) {
                noRecordsCount++;
                if (noRecordsCount > giveUp)
                    break;
                else
                    continue;
            }

            consumerRecords.forEach(record -> {
                System.out.printf("Consumer Record:(%d, %s, %d, %d)\n",
                        record.key(), record.value(),
                        record.partition(), record.offset());
            });

            consumer.commitAsync();
        }
        consumer.close();

        System.out.println("DONE");
    }

}
