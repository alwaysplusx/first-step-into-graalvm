package com.example.playground;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// @SerializationHint(types = Customer.class)
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

    @Bean
    ApplicationRunner serializationRunner(@Value("file:///${user.home}/output") Resource outputResource) {
        return args -> {
            var outputFile = outputResource.getFile();
            try (var out = new ObjectOutputStream(new FileOutputStream(outputFile))) {
                var customer = new Customer(1, "Andy");
                out.writeObject(customer);
                System.out.println("wrote: " + customer);
            }

            try (var in = new ObjectInputStream(new FileInputStream(outputFile))) {
                var customer = (Customer) in.readObject();
                System.out.println("read: " + customer);
            }
        };
    }

}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Customer implements Serializable {
    private int id;
    private String name;
}

