///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.uwindsor.alumniCarpool.service.user;
//
//import com.uwindsor.alumniCarpool.dto.viewDto.UserViewDto;
///**
// *
// * @author damilola
// */
//import com.uwindsor.alumniCarpool.model.User;
//import com.uwindsor.alumniCarpool.request.UserDeleteRequest;
//
//import org.springframework.data.domain.Pageable;
//
//import java.util.List;
//
//public interface UserService {
//    User add(User createDto);
//    List<User> getAll();
//    User getById(int id);
//    List<User> slice(Pageable pageable);
//    void deleteById(int id);
//    List<UserViewDto> getUserViewDto();
//    User getByUserName(String userName);
//    void authDeleteByUser(UserDeleteRequest userDeleteRequest);
//    User findByEMail(String eMail);
//    void updateByUserName(int userId, String userName);
//    void updateByNotificationPermission(int userId, boolean permission);
//}
//
