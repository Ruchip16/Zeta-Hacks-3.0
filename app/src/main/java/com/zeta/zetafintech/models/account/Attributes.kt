package com.zeta.zetafintech.models.account


import com.squareup.moshi.Json

data class Attributes(
    @Json(name = "bundle.name")
    val bundleName: String?,
    @Json(name = "zeta.business-id")
    val zetaBusinessId: String?,
    @Json(name = "zeta.card-program-id")
    val zetaCardProgramId: String?
)