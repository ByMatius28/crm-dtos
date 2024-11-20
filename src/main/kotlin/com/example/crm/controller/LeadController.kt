package com.example.crm.controller

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead
import com.example.crm.service.LeadService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/leads")
class LeadController {

    @Autowired
    lateinit var leadService: LeadService

    @GetMapping
    fun getLeads() = leadService.getLeads()

    @PostMapping
    fun save(@RequestBody @Valid leadDto: LeadDto): Lead {
        return leadService.save(leadDto)
    }

    @GetMapping("/{id}")
    fun getLeadById(@PathVariable id: Long): Lead {
        return leadService.getLeadById(id)
    }

    @DeleteMapping("/{id}")
    fun deleteLead(@PathVariable id: Long) {
        leadService.deleteLead(id)
    }
}