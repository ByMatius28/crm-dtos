package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CustomerDto {

    @NotNull(message = "Full name is required")
    @NotBlank(message = "Full name is required")
    var fullName: String? = null

    @NotBlank(message = "Full name is required")
    @NotNull(message = "Email is required")
    var email: String? = null

}