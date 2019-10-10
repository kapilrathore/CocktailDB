package com.kapilrathore.cocktaildb

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CocktailResponse(
    val drinks: List<Cocktail>
)

@JsonClass(generateAdapter = true)
data class Cocktail(
    @Json(name = "idDrink")
    val id: String,

    @Json(name = "strDrink")
    val name: String,

    @Json(name = "strInstructions")
    val instructions: String
)