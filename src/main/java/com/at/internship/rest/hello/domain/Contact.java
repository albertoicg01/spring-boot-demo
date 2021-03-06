package com.at.internship.rest.hello.domain;

import lombok.Data;

import javax.swing.event.InternalFrameEvent;
import java.time.LocalDate;
/*
Instructions

Cargar una lista de contacts en memoria.
Crear un servicio de tipo get que devuelva la lista completa
El cumpleaños debe tener formato de fecha "dd/mm/yyyy"

* */
@Data
public class Contact {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private LocalDate birthDay;
    //We implement the constructor here
    public Contact(
            Integer id
            , String firstName
            , String lastName
            , String emailAddress
            , String phoneNumber
            , LocalDate birthDay
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
    }
}
