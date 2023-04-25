package com.example.threelayerarch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StringController {

    @GetMapping(value = "/hello")
    public List<String> getString() {
        List<String> list = new ArrayList<>();
        list

    }

}
