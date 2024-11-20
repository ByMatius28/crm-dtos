package com.example.crm.repository

import com.example.crm.entity.Activity
import com.example.crm.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivityRepository:JpaRepository<Activity, Long>{
}