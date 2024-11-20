package com.example.crm.entity

import jakarta.persistence.*

@Entity
@Table(name = "lead")
class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null

    var activityName: String? = null
    var description: String? = null

    @ManyToOne
    @JoinColumn(name = "activity_id")
    var activity: Activity? = null
}