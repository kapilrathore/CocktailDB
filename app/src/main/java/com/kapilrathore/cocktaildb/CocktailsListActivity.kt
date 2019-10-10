package com.kapilrathore.cocktaildb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.MainThread
import io.reactivex.Scheduler
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class CocktailsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cocktails_list)

        NetworkManager.service.fetchCocktail()
            .subscribeOn(Schedulers.computation())
            .observeOn(Schedulers.io())
            .subscribeBy(
                onNext = { Log.i("Hit", "${it.drinks.first()}") },
                onError = { Log.i("Hit-Error", "$it") },
                onComplete = { Log.i("Hit", "Completed") }
            )
    }
}
