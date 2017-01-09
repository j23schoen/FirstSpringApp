package com.example.controllers

import com.example.Lift
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LiftingController {

    @RequestMapping("lift")
    public Lift index(@RequestParam(value = "name", defaultValue = "Bench") String name) {
        Lift lift = new Lift()
        lift.with{
            id = 4
            typeOfLift = name
        }
        return lift
    }

}
