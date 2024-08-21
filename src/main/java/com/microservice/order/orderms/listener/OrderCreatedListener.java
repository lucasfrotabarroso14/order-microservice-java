package com.microservice.order.orderms.listener;

import com.microservice.order.orderms.listener.dto.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;

import static com.microservice.order.orderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;

public class OrderCreatedListener {

    @RabbitListener(queues=ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){

    }
}
