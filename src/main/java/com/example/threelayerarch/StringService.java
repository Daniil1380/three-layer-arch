package com.example.threelayerarch;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringService {

    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Ткаченко Даниил Юрьевич");
        list.add("Петров Павел Петрович");
        return list;
    }

}
