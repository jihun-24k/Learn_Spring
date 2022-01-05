package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@RequestParam String account, @PathVariable String userId){
        System.out.println(userId);
        System.out.println(account);
    }
}
