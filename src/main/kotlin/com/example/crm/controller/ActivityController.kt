package com.example.crm.controller

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity
import com.example.crm.service.ActivityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/activities")
class ActivityController {

    @Autowired
    lateinit var activityService: ActivityService

    @GetMapping
    fun getActivities() = activityService.getActivities()

    @PostMapping
    fun save(@RequestBody activityDto: ActivityDto): Activity {
        return activityService.saveActivity(activityDto)
    }

    @GetMapping("/{id}")
    fun getActivityById(@PathVariable id: Long): Activity {
        return activityService.getActivityById(id)
    }

    @DeleteMapping("/{id}")
    fun deleteActivity(@PathVariable id: Long) {
        activityService.deleteActivity(id)
    }
}