package com.zeta.zetafintech.models.account

import com.squareup.moshi.Json

data class AccountDetails(
    @Json(name = "accessors")
    val accessors: List<Any>?,
    @Json(name = "accountProviderID")
    val accountProviderID: String?,
    @Json(name = "attributes")
    val attributes: Attributes?,
    @Json(name = "createdAt")
    val createdAt: CreatedAt?,
    @Json(name = "id")
    val id: String?,
    @Json(name = "ifiID")
    val ifiID: Int?,
    @Json(name = "ledgerID")
    val ledgerID: Long?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "ownerAccountHolderID")
    val ownerAccountHolderID: String?,
    @Json(name = "productFamilyID")
    val productFamilyID: Long?,
    @Json(name = "productID")
    val productID: Long?,
    @Json(name = "programIDs")
    val programIDs: List<Any>?,
    @Json(name = "relationships")
    val relationships: List<Any>?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "tags")
    val tags: List<Tag>?,
    @Json(name = "updatedAt")
    val updatedAt: UpdatedAt?,
    @Json(name = "vectors")
    val vectors: List<Any>?
)