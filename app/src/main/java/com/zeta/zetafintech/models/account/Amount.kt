package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class Amount(
    @Json(name = "amount")
    val amount: Int?,
    @Json(name = "currency")
    val currency: String?
)