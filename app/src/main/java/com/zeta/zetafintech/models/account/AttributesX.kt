package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class AttributesX(
    @Json(name = "additionalProp1")
    val additionalProp1: String?,
    @Json(name = "additionalProp2")
    val additionalProp2: String?,
    @Json(name = "additionalProp3")
    val additionalProp3: String?
)