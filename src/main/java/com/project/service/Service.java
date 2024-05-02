package com.project.service;

import com.project.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

/*
* This is a repository class where response entity
* is the return type which is an object which returns message as one of the argument
* and other argument http status is accepted.
*/
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    AdminRepository adminRepository;

    String message = "";

    public ResponseEntity<Object> verifyUser(String username, String password) {
        int count = adminRepository.countByUserIdAndPassword(username, password);
        if(count > 0) {
            message = "Login Successfull";
        } else {
            message = "Login Unsuccessfull";
        }
        return new ResponseEntity<>(message, HttpStatus.ACCEPTED);
    }

    public ResponseEntity<Object> insertIntoAccount(String username, Long amount, Long balance, Long userId) {
        adminRepository.insertAmount(userId, username, amount, balance);
        return new ResponseEntity<>("Transaction Complete!", HttpStatus.ACCEPTED);
    }

    public List<Object[]> getCurrentAccountBalance(String username, Long userId, Long balance) {
        return adminRepository.getCurrentAccountDetails();
    }

    public List<Object[]> getSavingsAccountBalance(String username, Long userId, Long balance) {
        return adminRepository.getSavingsAccountDetails();
    }
}
