package com.at.internship.rest.hello.dto;

import lombok.Data;


@Data
//{message:hello}
public class HelloDto {
    private String message;

    //Constructor
    public HelloDto(String message){
        this.message=message;

    }
}
