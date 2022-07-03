package com.failoc.tercerapracticacalificada.CharacterPokemon.DetailsPoke

import com.failoc.tercerapracticacalificada.ApiService
import com.failoc.tercerapracticacalificada.CharacterPokemon.CharacterResponse
import com.failoc.tercerapracticacalificada.PokemonResponse
import io.reactivex.Single

class DetailsRepository {

    private val api = ApiService().apiService

    fun detallePokemon(nombre: String): Single<CharacterResponse> {
        return api.detallePokemon(nombre)
    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA
}