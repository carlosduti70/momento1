package com.example.demo.controller

import com.example.demo.model.Conference
import com.example.demo.service.ConferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Conference")   //endpoint
class ConferenceController {
    @Autowired
    lateinit var conferenceService: ConferenceService

    @GetMapping
    fun list ():List <Conference>{
        return conferenceService.list()

    }
    @PostMapping
    fun save (@RequestBody conference: Conference): ResponseEntity<Conference> {
        return ResponseEntity(conferenceService.save(conference), HttpStatus.OK)
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): ResponseEntity<*>{
        return ResponseEntity(conferenceService.listById (id), HttpStatus.OK)
    }

    //delete
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean?{
        return conferenceService.delete(id)
    }
}