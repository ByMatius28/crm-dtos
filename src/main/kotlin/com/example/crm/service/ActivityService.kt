package com.example.crm.service

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity
import com.example.crm.mapper.ActivityMapper
import com.example.crm.repository.ActivityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivityService {

    @Autowired
    lateinit var activityRepository: ActivityRepository

    fun getActivities(): List<Activity> {
        return activityRepository.findAll()
    }

    fun saveActivity(activityDto: ActivityDto): Activity {
        val activity = ActivityMapper.toEntity(activityDto)
        return activityRepository.save(activity)
    }

    fun getActivityById(id: Long): Activity {
        return activityRepository.findById(id).orElseThrow { RuntimeException("Activity not found") }
    }

    fun deleteActivity(id: Long) {
        activityRepository.deleteById(id)
    }
}