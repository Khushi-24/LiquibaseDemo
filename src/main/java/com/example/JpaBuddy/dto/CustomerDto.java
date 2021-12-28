package com.example.JpaBuddy.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CustomerDto{

    @NotNull
    private Long id;

    @NotNull
    @NotEmpty
    private String name;
}
