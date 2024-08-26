package com.microservice.order.orderms.controller;


import com.microservice.order.orderms.controller.dto.ApiResponse;
import com.microservice.order.orderms.controller.dto.OrderResponse;
import com.microservice.order.orderms.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customers/{customerId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> ListOrders(@PathVariable("customerId") Long customerId,
                                                                 @RequestParam(name = "page",defaultValue = "0") Integer page,
                                                                 @RequestParam(name="pageSize",defaultValue = "0")Integer pageSize){
        return ResponseEntity.ok(null);

    }


}
