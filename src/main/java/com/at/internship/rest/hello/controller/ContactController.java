package com.at.internship.rest.hello.controller;

import com.at.internship.rest.hello.dto.ContactDto;
import com.at.internship.rest.hello.service.IContactList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
@SuppressWarnings("unused")
public class ContactController {
    @Autowired
    private IContactList contactList;

    //We define constructor
    public ContactController(IContactList contactList){
        this.contactList=contactList;
    }

    @GetMapping("/mycontactlist")
    public List<ContactDto> getContactList(){
        return contactList.getContactList();
    }
}
