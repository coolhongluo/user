package com.service.lwhtest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-16T13:20:40.851Z")

@RestSchema(schemaId = "lwhtest")
@RequestMapping(path = "/lwhtest", produces = MediaType.APPLICATION_JSON)
public class LwhtestImpl {

    @Autowired
    private LwhtestDelegate userLwhtestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLwhtestDelegate.helloworld(name);
    }

}
