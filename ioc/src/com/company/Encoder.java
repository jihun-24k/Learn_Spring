package com.company;

import java.util.Base64;

public class Encoder {
    private IEncoder iEncoder;

    public Encoder(){
        //this.iEncoder = new Base64Encoder();
        this.iEncoder = new UrlEncoder();
    }

    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
