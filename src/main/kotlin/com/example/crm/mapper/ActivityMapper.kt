package com.example.crm.mapper

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity

object ActivityMapper {

    fun toEntity(activityDto: ActivityDto): Activity {
        return Activity(
            activityName = activityDto.activityName ?: "",
            description = activityDto.description ?: ""
        )
    }

    fun toDto(activity: Activity): ActivityDto {
        val activityDto = ActivityDto()
        activityDto.activityName = activity.activityName
        activityDto.description = activity.description
        return activityDto
    }
}