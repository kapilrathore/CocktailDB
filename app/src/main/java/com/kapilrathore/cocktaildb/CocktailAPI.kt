package com.kapilrathore.cocktaildb

import retrofit2.http.GET

interface CocktailAPI {
    @GET("/random.php")
    fun fetchCocktail(): CocktailResponse
}