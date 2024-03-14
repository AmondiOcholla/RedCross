package com.libetal.redcross.emergencies

import org.springframework.stereotype.Service

@Service
class EmergenciesService {

    fun create(emergencyRequest: EmergencyRequest): EmergencyResponse {
        val responseMessage = "Create Emergency For: ${emergencyRequest.location} name: ${emergencyRequest.name} phone: ${emergencyRequest.phone}"

        return EmergencyResponse(responseMessage)
    }

}
