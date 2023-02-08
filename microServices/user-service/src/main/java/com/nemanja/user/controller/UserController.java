package com.nemanja.user.controller;

import com.nemanja.user.VO.ResponseTemplateVO;
import com.nemanja.user.entity.UserS;
import com.nemanja.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
@Slf4j
public class UserController {

    private UserService service;

    @PostMapping("/")
    public UserS saveUser(@RequestBody UserS userS){
        log.info("inside saveUser method of UserController");
        return service.saveUser(userS);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("inside getUserWithDepartment method of UserController");
        return service.getUserWithDepartment(userId);
    }


}
