package com.at.internship.rest.hello.controller;
import com.at.internship.rest.hello.dto.HelloDto;
import com.at.internship.rest.hello.service.IPoliteSalutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* Notations
* */
@RestController
@RequestMapping("/hello")
@SuppressWarnings("unused")
//Nobody calls this class
public class HelloController {
    //@Autowired 1ST METHOD
    private IPoliteSalutation politeSalutation;


    public HelloController(IPoliteSalutation politeSalutation){
        this.politeSalutation=politeSalutation;
    }
    @GetMapping("/world")
    public HelloDto hello(){
        //HttpStatus.
        return new HelloDto("Hello World!");
    }

    @GetMapping("/polite")
    public HelloDto helloPolite(){
        return new HelloDto(politeSalutation.getPoliteSalutation());
    }

}
