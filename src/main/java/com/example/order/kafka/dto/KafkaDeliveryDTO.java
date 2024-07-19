package com.example.order.kafka.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record KafkaDeliveryDTO(
        Long orderId,
        String storeName,
        String storeAddress,
        int deliveryFee,
        double distanceFromStoreToCustomer,
        double storeLongitude,
        double storeLatitude,
        LocalDateTime due

) {
}