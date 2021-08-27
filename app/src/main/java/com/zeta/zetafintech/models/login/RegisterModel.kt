package com.zeta.zetafintech.models.login


import com.squareup.moshi.Json

data class RegisterModel(
    @Json(name = "dob")
    val dob: String?,
    @Json(name = "email")
    val email: String?,
    @Json(name = "firstname")
    val firstname: String?,
    @Json(name = "lastname")
    val lastname: String?,
    @Json(name = "password")
    val password: String?,
    @Json(name = "phone")
    val phone: String?
)