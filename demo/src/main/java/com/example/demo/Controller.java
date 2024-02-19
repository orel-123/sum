package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/sum")
public class Controller {
    @PostMapping

    public int sum(@RequestBody NumbersRequest numbersRequest) {
        List<Integer> numbers = numbersRequest.getNumbers();
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

}
