package com.failoc.tercerapracticacalificada.ListPokemon

import com.failoc.tercerapracticacalificada.ApiService
import com.failoc.tercerapracticacalificada.PokemonResponse
import io.reactivex.Single

class PokeRepository {

    private val api = ApiService().apiService

    fun listarPokemon(limit: Int, offset: Int): Single<PokemonResponse> {
        return api.listPokemon(limit, offset)
    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA
}