package com.uwindsor.alumniCarpool.model;

import java.util.Date;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "orders")
public class Order {
	@Id
	private String id;

	private User driver;
	private String status; //vacant -> full -> finished.

	private String departureCity;
	private String departureLocation;

	private String arrivalCity;
	private String arrivalLocation;

	private String departureDate;
	private String departureTime;
	private Date creatingTime; //The insertion time generated in db automatically

    public Order(){

    }

	public Order(User driver, String status, String departureCity, String departureLocation, String arrivalCity, String arrivalLocation, String departureDate, String departureTime) {
		this.driver = driver;
		this.status = status;
		this.departureCity = departureCity;
		this.departureLocation = departureLocation;
		this.arrivalCity = arrivalCity;
		this.arrivalLocation = arrivalLocation;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
	}

}
