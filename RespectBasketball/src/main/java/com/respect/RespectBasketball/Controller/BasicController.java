package com.respect.RespectBasketball.Controller;


import com.respect.RespectBasketball.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "Basic")
public class BasicController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/GetAllAccount")
    public ResponseEntity<?> index() {
        return new ResponseEntity<>(accountRepository.findAll(), HttpStatus.OK);
    }
}
