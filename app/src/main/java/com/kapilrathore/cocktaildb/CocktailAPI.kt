package com.kapilrathore.cocktaildb

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface CocktailAPI {
    @GET("random.php")
    fun fetchCocktail(): Observable<CocktailResponse>
}