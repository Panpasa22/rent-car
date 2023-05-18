package com.it.controller;

import org.apache.commons.lang3.ObjectUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.AuthenDto;
import com.it.entity.UserEntity;
import com.it.repository.UserRepository;
import com.it.utils.PasswordEncryptorUtils;

@RequestMapping("/authentication")
@RestController
public class AuthenController {

    // @Autowired 
     //private UserRepository userRepository;
	@ResponseBody
    @PostMapping( value = "/login")
    public  ResponseEntity<UserEntity> usernameByLoginPassword(@RequestBody AuthenDto request){
//        UserEntity entity = userRepository.findByUserName(request.getUsername());
//         if (ObjectUtils.isNotEmpty(entity) && PasswordEncryptorUtils.checkPassword(request.getPassword(),entity.getUserPassword())) {
//             return ResponseEntity.ok(entity);
//         }else {
//            return ResponseEntity.ok(entity);
//            } 
    	return null;
    
         }
    }