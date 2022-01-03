package com.example.JpaBuddy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Orders extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "total_quantity")
    private Long totalQuantity;

    @Column(name = "total_price")
    private Float totalPrice;

}