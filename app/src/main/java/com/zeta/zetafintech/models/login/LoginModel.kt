package com.zeta.zetafintech.models.login


import com.squareup.moshi.Json

data class LoginModel(
    @Json(name = "email")
    val email: String?,
    @Json(name = "password")
    val password: String?
)