package com.failoc.tercerapracticacalificada.CharacterPokemon.DetailsPoke

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.failoc.tercerapracticacalificada.CharacterPokemon.CharacterResponse
import com.failoc.tercerapracticacalificada.CharacterPokemon.Types
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class DetailsViewModel: ViewModel() {

    private val repository = DetailsRepository()
    private val disposable = CompositeDisposable()

    val pokeDetailsResponse = MutableLiveData<List<Types>>()

    fun PokemonDetails() {
        disposable.add(
            repository.detallePokemon("bulbasaur")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<CharacterResponse>() {
                    override fun onSuccess(t: CharacterResponse) {

                        var PokemonDetails = t.types
                        pokeDetailsResponse.value = PokemonDetails
                        Log.v("POKEMON_LIST", PokemonDetails.toString())

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