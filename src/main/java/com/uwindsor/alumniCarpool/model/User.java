package com.uwindsor.alumniCarpool.model;

import org.bson.codecs.BinaryCodec;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Stack;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "users")
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User {
	@Id
	private int id;
	//@NotNull(message = "{com.eCommerceProject.notnull.username.message}")
    //@Column(name = "username")
    //private String userName;
	private String email;//Username
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private String phone;
	private BinaryCodec avatar;

	private List<String> roles; //All roles user registered
	private String currentRole; //The role user logged in with.

	private String almaMater; //User's alma mater
	private String studentId;
	//private List<BinaryCodec> certificate; //Certificate of alumni, driver license, and so forth.
	private BinaryCodec certificate;

	private float rating; //everyone has a rate of 100 initially. When someone rate him/her at 5, he/she get a 1 score added up to the rate; if he/she gets a score of 3, his/her rate is deducted by 1.
	private int review; //how many passenger has reviewed this driver;
	private List<String> tags;	//NoPet, FrontSeat, SUV...

	private Car car;
	private boolean verified=false;

	//system messages
	private Stack<Message> messages;
        
        @Column(name = "createDate")
        private Date userCreateDate;

        @Column(name = "notificationPermission")
        private boolean notificationPermission = true;
	// public User() {
	// }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
        
        public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
        
        public String getUserName() {
		return email;
	}

	public void setUserName(String email) {
		this.email = email;
	}
        
        public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return BinaryCodec return the avatar
     */
    public BinaryCodec getAvatar() {
        return avatar;
    }

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(BinaryCodec avatar) {
        this.avatar = avatar;
    }

    /**
     * @return String return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return BinaryCodec return the certificate
     */
    public BinaryCodec getCertificate() {
        return certificate;
    }

    /**
     * @param certificate the certificate to set
     */
    public void setCertificate(BinaryCodec certificate) {
        this.certificate = certificate;
    }

    /**
     * @return int return the review
     */
    public int getReview() {
        return review;
    }

    /**
     * @param review the review to set
     */
    public void setReview(int review) {
        this.review = review;
    }

    /**
     * @return Car return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car the car to set
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * @return boolean return the verified
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * @param verified the verified to set
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     * @return Stack<Message> return the messages
     */
    public Stack<Message> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(Stack<Message> messages) {
        this.messages = messages;
    }
    //---
        /**
     * @return Date return the messages
     */
    public Date getUserCreateDate() {
        return userCreateDate;
    }

    /**
     * @param messages the messages to set
     */
    public void setUserCreateDate(Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
    //---
            /**
     * @return boolean return the notificationPermission
     */
    public boolean getNotificationPermission() {
        return notificationPermission;
    }

    /**
     * @param notificationPermission the notificationPermission to set
     */
    public void setNotificationPermission(boolean notificationPermission) {
        this.notificationPermission = notificationPermission;
    }
    
      public User(String userName, String password, String eMail, Date userCreateDate, boolean notificationPermission) {
        //this.userName = userName;
        this.password = password;
        this.email = eMail;
        this.userCreateDate = userCreateDate;
        this.notificationPermission = notificationPermission;
    }
}
