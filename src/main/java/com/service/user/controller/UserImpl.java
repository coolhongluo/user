package com.service.user.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-10T08:34:53.666Z")

@RestSchema(schemaId = "user")
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON)
public class UserImpl {

    @Autowired
    private UserDelegate userUserDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userUserDelegate.helloworld(name);
    }

}
