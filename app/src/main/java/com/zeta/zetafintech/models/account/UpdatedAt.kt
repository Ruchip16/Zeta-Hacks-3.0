package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class UpdatedAt(
    @Json(name = "date")
    val date: Date?,
    @Json(name = "time")
    val time: Time?
)