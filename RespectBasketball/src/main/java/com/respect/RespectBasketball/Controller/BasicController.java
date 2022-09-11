package com.respect.RespectBasketball.Controller;

import com.respect.RespectBasketball.Model.AccountListModel;
import com.respect.RespectBasketball.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "Basic")
public class BasicController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/GetAllAccount")
    public ResponseEntity<?> index() {
        return new ResponseEntity<>(accountRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/GetAccount")
    public ResponseEntity<?> GetAccount(@RequestBody AccountListModel accountListModel) {

        return new ResponseEntity<>(accountRepository.findAll(), HttpStatus.OK);
    }
}
