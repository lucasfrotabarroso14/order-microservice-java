package com.microservice.order.orderms.repository;

import com.microservice.order.orderms.controller.dto.OrderResponse;
import com.microservice.order.orderms.entities.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {

    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
