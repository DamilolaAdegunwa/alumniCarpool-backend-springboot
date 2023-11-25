///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.uwindsor.alumniCarpool.dto.viewDto;
//
//import com.uwindsor.alumniCarpool.model.User;
//import lombok.Getter;
//
//import java.io.Serializable;
//
//@Getter
//public class UserViewDto implements Serializable {
//
//    private static final Long serialVersionID = 1L;
//
//    private final String userName;
//    private final String eMail;
//    private final String password;
//
//    private UserViewDto(String userName, String eMail, String password) {
//        this.userName = userName;
//        this.eMail = eMail;
//        this.password = password;
//    }
//
//    public static UserViewDto of(User user) {
//        return new UserViewDto(user.getUserName(), user.getPassword() ,user.getEmail());
//    }
//
//}