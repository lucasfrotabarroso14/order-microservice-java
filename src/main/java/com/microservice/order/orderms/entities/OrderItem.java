package com.microservice.order.orderms.entities;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;

public class OrderItem {

    private String product;

    private Integer quantity;

    @Field(targetType= FieldType.DECIMAL128)
    private BigDecimal price;





}
