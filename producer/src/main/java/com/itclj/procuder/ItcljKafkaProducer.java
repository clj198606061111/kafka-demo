package com.itclj.procuder;

public class ItcljKafkaProducer {
    public static void main(String[] args) {
        // 启动生产者，发送两条消息
        new Thread(new OriginalProducer()).start();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
