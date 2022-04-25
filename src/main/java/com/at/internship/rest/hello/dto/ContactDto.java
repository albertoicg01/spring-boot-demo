package com.at.internship.rest.hello.dto;

import lombok.Data;

@Data
public class ContactDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String birthDay;


    public ContactDto(Integer id
            , String firstName
            , String lastName
            , String emailAddress
            , String phoneNumber
            , String birthDay
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
    }

}
