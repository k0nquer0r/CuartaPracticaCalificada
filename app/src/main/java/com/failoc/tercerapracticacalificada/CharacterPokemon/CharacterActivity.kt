package com.failoc.tercerapracticacalificada.CharacterPokemon

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.failoc.tercerapracticacalificada.CharacterPokemon.DetailsPoke.DetailsViewModel
import com.failoc.tercerapracticacalificada.R

class CharacterActivity: AppCompatActivity() {

    private lateinit var viewModel: DetailsViewModel
    lateinit var list: List<Types>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

        viewModel.PokemonDetails()

        observableViewModel()
    }

    private fun observableViewModel() {
        viewModel.pokeDetailsResponse.observe(this) {
            list = it
            Log.v("lista_retrofit_usuarios", it.toString())
        }



    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA
}