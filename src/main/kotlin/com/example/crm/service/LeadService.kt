package com.example.crm.service

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead
import org.springframework.stereotype.Service

@Service
class LeadService {

    fun getLeads(): List<Lead> {
        return listOf() // Replace with actual implementation
    }

    fun saveLead(leadDto: LeadDto): Lead {
        return Lead() // Replace with actual implementation
    }

    fun getLeadById(id: Long): Lead {
        return Lead() // Replace with actual implementation
    }

    fun deleteLead(id: Long) {
        // Implementation here
    }

    fun setStatus(id: Long, status: String) {
        // Implementation here
    }
}