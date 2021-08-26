package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class Tag(
    @Json(name = "type")
    val type: String?,
    @Json(name = "value")
    val value: String?
)