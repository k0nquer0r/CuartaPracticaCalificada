package com.failoc.tercerapracticacalificada

import com.failoc.tercerapracticacalificada.CharacterPokemon.CharacterResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {


    // https://pokeapi.co/api/v2/pokemon?limit=100&offset=0
    @GET("api/v2/pokemon")
    fun listPokemon(@Query("limit") limit: Int, @Query("offset") offset: Int): Single<PokemonResponse>

    // https://pokeapi.co/api/v2/pokemon/ditto
    @GET("api/v2/pokemon/{nombre}")
    fun detallePokemon(@Path("nombre") nombre: String): Single<CharacterResponse>
}

//DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA