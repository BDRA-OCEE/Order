package com.catJam.Order.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, OrderEmbeddedId> {
    List<OrderEntity> findByIdName(String name);


}
