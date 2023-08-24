package com.example.conflictdemo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Value;


@Value
@Schema(name = "Test dto")
public class TestDto {
    @Schema(required = true)
    String field;
}
