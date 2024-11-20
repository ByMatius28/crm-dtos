package com.example.crm.entity

import jakarta.persistence.*

@Entity
class Activity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var activityName: String,
    var description: String
) {
    @OneToMany(mappedBy = "activity", cascade = [CascadeType.ALL], orphanRemoval = true)
    var leads: MutableList<Lead> = mutableListOf()
}