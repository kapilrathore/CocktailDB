package com.kapilrathore.cocktaildb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CocktailsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cocktails_list)

//        val /randomCocktail = NetworkManager.service.fetchCocktail().drink.first()
        val randomCocktail = NetworkManager.a
//        print(randomCocktail)
    }
}
