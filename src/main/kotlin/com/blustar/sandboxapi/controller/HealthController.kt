package com.blustar.sandboxapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthController {

    @GetMapping
    fun checkHealthy(): Map<String, String> {
        return mapOf("status" to "good")
    }

}
