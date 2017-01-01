package com.example

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @RequestMapping("sample")
    public String index() {
        return "Whad up!";
    }
}
