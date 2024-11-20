package com.example.crm.service

import com.example.crm.dto.CustomerDto
import com.example.crm.entity.Customer
import org.springframework.stereotype.Service

@Service
class CustomerService {

    fun getCustomers(): List<Customer> {
        return listOf() // Replace with actual implementation
    }

    fun saveCustomer(customerDto: CustomerDto): Customer {
        return Customer() // Replace with actual implementation
    }

    fun getCustomerById(id: Long): Customer {
        return Customer() // Replace with actual implementation
    }

    fun deleteCustomer(id: Long) {
        // Implementation here
    }
}