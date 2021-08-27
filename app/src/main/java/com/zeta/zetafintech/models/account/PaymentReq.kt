package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class PaymentReq(
    @Json(name = "amount")
    val amount: Amount?,
    @Json(name = "attributes")
    val attributes: AttributesXX?,
    @Json(name = "creditAccountID")
    val creditAccountID: String?,
    @Json(name = "debitAccountID")
    val debitAccountID: String?,
    @Json(name = "remarks")
    val remarks: String?,
    @Json(name = "requestID")
    val requestID: String?,
    @Json(name = "transferCode")
    val transferCode: String?,
    @Json(name = "transferTime")
    val transferTime: Long?
)