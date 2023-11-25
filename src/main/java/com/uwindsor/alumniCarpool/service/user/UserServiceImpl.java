///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.uwindsor.alumniCarpool.service.user;
//import com.uwindsor.alumniCarpool.dto.viewDto.UserViewDto;
//import com.uwindsor.alumniCarpool.model.User;
//import com.uwindsor.alumniCarpool.repository.UserRepository;
//import com.uwindsor.alumniCarpool.request.UserDeleteRequest;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
//
//@Service
////@RequiredArgsConstructor
//public class UserServiceImpl implements UserService {
//
//    //@Autowired
//    private final UserRepository userRepository = null;
//
//    public UserServiceImpl() {
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public UserServiceImpl(UserRepository userRepository) {
//        
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public User add(User userCreateDto) {
//         this.userRepository.save(new User(userCreateDto.getUserName(),
//                userCreateDto.getPassword(), userCreateDto.getEmail(), userCreateDto.getUserCreateDate(), userCreateDto.getNotificationPermission()));
//        return userCreateDto;
//    }
//
//    @Override
//    public List<User> getAll() {
//        final List<User> users = this.userRepository.findAll();
//        return users;
//    }
//
//    @Override
//    public User getById(int id) {
//        //return userRepository.findById(id).orElseThrow(() -> new NotFoundException("user couldn't be found by following id: " + id));
//        return userRepository.findById(id);
//    }
//
//    @Override
//    public List<User> slice(Pageable pageable) {
//        final List<User> users = this.userRepository.findAll(pageable).stream().collect(Collectors.toList());
//        return users;
//    }
//
//    @Override
//    public void deleteById(int id) {
//        this.userRepository.deleteById(id);
//    }
//
//    @Override
//    public List<UserViewDto> getUserViewDto() {
//        final List<UserViewDto> users = this.userRepository.findAll().stream().map(UserViewDto::of).collect(Collectors.toList());
//        return users;
//    }
//
//   @Override
//    public User getByUserName(String userName) {
//        return userRepository.findByUserName(userName);
//   }
//
//    @Override
//    public void authDeleteByUser(UserDeleteRequest userDeleteRequest) {
//        User user = userRepository.findByEmail(userDeleteRequest.getEMail());
//        userRepository.deleteById(user.getId());
//    }
//
//    @Override
//    public User findByEMail(String eMail) {
//        return userRepository.findByEmail(eMail);
//    }
//
//    @Override
//    public void updateByUserName(int userId, String userName) {
//        Optional<User> user = Optional.ofNullable( userRepository.findById(userId));
//
//        if (user.isPresent()) {
//            user.get().setUserName(userName);
//            userRepository.save(user.get());
//        }
//    }
//
//    @Override
//    public void updateByNotificationPermission(int userId, boolean permission) {
//        Optional<User> user = Optional.ofNullable(userRepository.findById(userId));
//
//        if (user.isPresent()) {
//            user.get().setNotificationPermission(permission);
//            userRepository.save(user.get());
//        }
//
//    }
//}
