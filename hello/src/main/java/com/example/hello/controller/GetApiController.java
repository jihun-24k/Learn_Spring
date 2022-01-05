package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // get http://localhost:8080/api/get/hello
    public String hello(){
        return "get hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get http://localhost:8080/api/get/hi
    public String hi(){
        return "hi";
    }

    // http://localhost:8080/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : "+ pathName);
        return pathName;
    }

    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gamail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("/n");

            sb.append(entry.getKey()+" = "+ entry.getValue());
        });

        return sb.toString();
    }

    @GetMapping(path = "query-param02")
    public String queryParam02(
            @RequestParam String user,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(user);
        System.out.println(email);
        System.out.println(age);

        return user +" " + email + " "+ age;
    }

    @GetMapping(path = "query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
