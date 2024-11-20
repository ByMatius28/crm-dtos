package com.example.crm.mapper

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead

object LeadMapper {

    fun toEntity(leadDto: LeadDto): Lead {
        val lead = Lead()
        lead.activityName = leadDto.activityName
        lead.description = leadDto.description
        return lead
    }
}

