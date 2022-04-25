package com.at.internship.rest.hello.service.impl;

import java.net.SocketTimeoutException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import com.at.internship.rest.hello.domain.Contact;
import com.at.internship.rest.hello.dto.ContactDto;
import com.at.internship.rest.hello.service.IContactList;
import org.springframework.stereotype.Service;


/*
    Instructions

    Cargar una lista de contacts en memoria. [done]
    Crear un servicio de tipo get que devuelva la lista completa [done]
    El cumpleaños debe tener formato de fecha "dd/mm/yyyy" [done]

*/



@Service
public class ContactListImp implements IContactList {
    //Attributes
    private String format = "dd/MM/YYYY";

    private  List<Contact> contactList = Arrays.asList(
            new Contact(1
                    , "Alberto"
                    , "Cruz"
                    , "intern32@agilethought.com"
                    , "5526999500"
                    , LocalDate.of(1997,5,7)),

            new Contact(2
                    , "Ricardo"
                    , "Bustamante"
                    , "rbustamante@prb.com.mx"
                    , "5556476461"
                    , LocalDate.of(1980,5,11))
    );

    //We override the method who comes from the interface
    @Override
    public List<ContactDto> getContactList() {
        return this.contactList.stream().map(a -> new ContactDto(
                a.getId(),
                a.getFirstName(),
                a.getLastName(),
                a.getEmailAddress(),
                a.getPhoneNumber(),
                a.getBirthDay().format(DateTimeFormatter.ofPattern(format)).toString()
        )).collect(Collectors.toList());


    }
}
