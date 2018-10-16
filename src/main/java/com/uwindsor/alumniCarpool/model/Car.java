package com.uwindsor.alumniCarpool.model;

import lombok.Data;
import org.bson.codecs.BinaryCodec;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "cars")
public class Car {
    @Id
    private String id;
    private String plateNum;
    private Object carPhoto;
    private User driver;
    private List<Seat> seats;

    public Car(String plateNum, BinaryCodec carPhoto, User driver, List<Seat> seats) {
        this.plateNum = plateNum;
        this.carPhoto = carPhoto;
        this.driver = driver;
        this.seats = seats;
    }
}
