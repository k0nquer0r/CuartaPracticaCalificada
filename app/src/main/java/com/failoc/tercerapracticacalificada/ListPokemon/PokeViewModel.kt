package com.failoc.tercerapracticacalificada.ListPokemon

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.failoc.tercerapracticacalificada.Pokemon
import com.failoc.tercerapracticacalificada.PokemonResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class PokeViewModel: ViewModel()  {

    private val repository = PokeRepository()
    private val disposable = CompositeDisposable()

    val pokeListResponse = MutableLiveData<List<Pokemon>>()

    fun listarPokemones() {
        disposable.add(
            repository.listarPokemon(10, 10)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<PokemonResponse>() {
                    override fun onSuccess(t: PokemonResponse) {

                        var listPokemon = t.results
                        pokeListResponse.value = listPokemon
                        Log.v("POKEMON_LIST", listPokemon.toString())

                    }

                    override fun onError(e: Throwable) {
                        Log.v("POKEMON_LIST", e.localizedMessage)
                        Log.v("POKEMON_LIST", "error")
                    }
                })
        )
    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA
}