package com.gallary.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name= "items")
public class Item {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100)
    private String imgPath;

    @Column(length = 11)
    private int price;

    @Column(length = 11)
    private int discountPer;


}
