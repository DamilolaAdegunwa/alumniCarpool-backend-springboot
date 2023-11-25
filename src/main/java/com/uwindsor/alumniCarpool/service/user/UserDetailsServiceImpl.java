///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.uwindsor.alumniCarpool.service.user;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.uwindsor.alumniCarpool.model.User;
//import com.uwindsor.alumniCarpool.security.JwtUserDetails;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@Service
////@RequiredArgsConstructor
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private final UserService userService = null;
//
//    public UserDetailsServiceImpl() {
//        //UserService u = userService;
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userService.getByUserName(username);
//        return JwtUserDetails.create(user);
//    }
//
//    public UserDetails loadUserById(int id) {
//        User user = userService.getById(id);
//        return JwtUserDetails.create(user);
//    }
//
//}