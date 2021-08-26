package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class Date(
    @Json(name = "day")
    val day: Int?,
    @Json(name = "month")
    val month: Int?,
    @Json(name = "year")
    val year: Int?
)