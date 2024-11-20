package com.example.crm.controller

import com.example.crm.dto.CustomerDto
import com.example.crm.entity.Customer
import com.example.crm.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/customers")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun getCustomers() = customerService.getCustomers()

    @PostMapping
    fun save(@RequestBody customerDto: CustomerDto): Customer {
        return customerService.saveCustomer(customerDto)
    }

    @GetMapping("/{id}")
    fun getCustomerById(@PathVariable id: Long): Customer {
        return customerService.getCustomerById(id)
    }

    @DeleteMapping("/{id}")
    fun deleteCustomer(@PathVariable id: Long) {
        customerService.deleteCustomer(id)
    }
}