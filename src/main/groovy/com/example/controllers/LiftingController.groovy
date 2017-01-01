package com.example.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LiftingController {

    @RequestMapping("lift")
    public String index() {
        return "you are in the lifting controller"
    }

}
