package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class AccountBalance(
    @Json(name = "accountingType")
    val accountingType: String?,
    @Json(name = "attributes")
    val attributes: AttributesX?,
    @Json(name = "balance")
    val balance: Int?,
    @Json(name = "currency")
    val currency: String?,
    @Json(name = "headers")
    val headers: Headers?,
    @Json(name = "lastTransactionID")
    val lastTransactionID: String?
)