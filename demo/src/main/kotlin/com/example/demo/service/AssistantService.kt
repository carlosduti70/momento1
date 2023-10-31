package com.example.demo.service

import com.example.demo.model.Assistant
import com.example.demo.repository.AssistantRepository
import com.example.demo.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class AssistantService {
    @Autowired
    lateinit var assistantRepository: AssistantRepository
    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun save(assistant: Assistant):Assistant{
        try {
            conferenceRepository.findById(assistant.conferenceId)
                    ?: throw Exception("Id del cliente no encontrada")
            return assistantRepository.save(assistant)
        }catch (ex : Exception){
            throw ResponseStatusException(
                    HttpStatus.NOT_FOUND, ex.message, ex)
        }
    }

    fun list ():List<Assistant>{
        return assistantRepository.findAll()
    }
    fun listById (id:Long?): Assistant?{
        return assistantRepository.findById(id)
    }
}
