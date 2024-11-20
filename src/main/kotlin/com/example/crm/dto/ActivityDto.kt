package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class ActivityDto {

    @NotNull(message = "Activity name is required")
    @NotBlank(message = "Activity name is required")
    var activityName: String? = null

    @NotBlank(message = "Description is required")
    @NotNull(message = "Description is required")
    var description: String? = null

}