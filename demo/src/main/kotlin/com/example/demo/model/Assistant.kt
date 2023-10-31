package com.example.demo.model

import jakarta.persistence.*

@Entity
@Table(name = "assistant")
class Assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    var fullname: String? = null
    var rols: String? = null
    var age: Int? = null
    @Column(name = "conference_id")
    var conferenceId: Long? = null
}