package com.redknight.memorytrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MemoryTrainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoryTrainerApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    /* todo: attach image to every card and display for mneumonic -
    print answer and say answer and show image...
    like an animal or something.
    maybe.
     */
}
