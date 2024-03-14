package com.libetal.redcross.emergencies

// Dependency Injection
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Int
 * Boolean
 * String
 **/
@RestController
@RequestMapping("/v1/emergencies")
class EmergenciesController (
    @Autowired val emergenciesService: EmergenciesService
){

    @PostMapping
    fun create(@RequestBody emergencyRequest: EmergencyRequest): EmergencyResponse {
        return emergenciesService.create(emergencyRequest)
    }

}
