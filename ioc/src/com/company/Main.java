package com.company;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding
        IEncoder base64Encoder = new Base64Encoder();
        String result = base64Encoder.encode(url);
        System.out.println(result);

        // url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);

        // 추상화를 마친 코드
//        Encoder encoder = new Encoder();
//        String eResult = encoder.encode(url);
//        System.out.println(eResult);

        // DI(객체 주입)
        Encoder encoder = new Encoder(new Base64Encoder());
        String dResult = encoder.encode(url);
        System.out.println(dResult);

    }
}
