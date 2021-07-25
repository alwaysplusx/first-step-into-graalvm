package com.example.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class NativePlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativePlaygroundApplication.class, args);
    }

    @Controller
    public static class EchoController {

        @ResponseBody
        @RequestMapping({"", "/", "/echo"})
        public String echo(@RequestParam(required = false) String name) {
            return String.format("Hello %s!", name == null ? "World" : name);
        }

    }

}

