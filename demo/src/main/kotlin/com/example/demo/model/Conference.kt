package com.example.demo.model

import jakarta.persistence.*

@Entity
@Table(name = "conference")
class Conference {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var title: String? = null
    var description: String? = null
    var city: String? = null
    @Column(name="total_assistants")
    var totalAssistants: Int? = null
}