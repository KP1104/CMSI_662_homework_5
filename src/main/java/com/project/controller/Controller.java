package com.project.controller;

import com.project.AccountInfo;
import com.project.Transaction;
import com.project.User;
import com.project.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

/*
* Rest controller is the annotation used for REST api service which in turn uses password encoder
* which is a hashing algorithm used for encryption and decryption of password.
*/

@RestController
public class Controller {

    @Autowired
    Service service;

    BCryptPasswordEncoder passwordEncoder;

    // Here I use the bcrypt password encoder which I use to encode password

    @PostMapping("/login")
    public ResponseEntity<Object> verify(@RequestBody User user) {
        String enc_pass = passwordEncoder.encode(user.getPassword());
        System.out.println(enc_pass);
        ResponseEntity<Object> response = service.verifyUser(user.getUsername(), user.getPassword());
        return response;
    }

    @PostMapping("/transaction")
    public String transaction(@RequestBody Transaction transaction) {
        String resp = String.valueOf(service.insertIntoAccount(transaction.getUserName(), transaction.getAmount(), transaction.getBalance(), transaction.getUserId()));
        return resp;
    }

    @PostMapping("/close_account")
    public String getCurrentAccount(@RequestBody AccountInfo accountInfo) {
        String resp = service.getCurrentAccountBalance(accountInfo.getUserName(), accountInfo.getUserId(), accountInfo.getBalance()).toString();
        return resp;
    }

    @PostMapping("/savings_account")
    public String getSavingsAccount(@RequestBody AccountInfo accountInfo) {
        String resp = service.getCurrentAccountBalance(accountInfo.getUserName(), accountInfo.getUserId(), accountInfo.getBalance()).toString();
        return resp;
    }
}
