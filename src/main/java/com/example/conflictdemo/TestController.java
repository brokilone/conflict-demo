package com.example.conflictdemo;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@Tag(name = "test controller")
public class TestController {

    @GetMapping
    public void test(TestDto dto) {
        System.out.println(dto);
    }
}
