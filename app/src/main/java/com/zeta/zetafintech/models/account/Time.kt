package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class Time(
    @Json(name = "hour")
    val hour: Int?,
    @Json(name = "minute")
    val minute: Int?,
    @Json(name = "nano")
    val nano: Int?,
    @Json(name = "second")
    val second: Int?
)