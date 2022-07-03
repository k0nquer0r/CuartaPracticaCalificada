package com.failoc.tercerapracticacalificada.ListPokemon

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.failoc.tercerapracticacalificada.CharacterPokemon.DetailsPoke.DetailsActivity
import com.failoc.tercerapracticacalificada.Pokemon
import com.failoc.tercerapracticacalificada.R
import kotlinx.android.synthetic.main.activity_pokemon.*

class PokemonActivity: AppCompatActivity() {

    private lateinit var viewModel: PokeViewModel
    lateinit var list: List<Pokemon>



    companion object {
        fun newInstance(): PokemonActivity = PokemonActivity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        val actionBar = supportActionBar
        actionBar?.hide()



        viewModel = ViewModelProvider(this).get(PokeViewModel::class.java)

        viewModel.listarPokemones()

        observableViewModel()

        btnDetails.setOnClickListener{
            startActivity(Intent(this, DetailsActivity::class.java))
        }


    }

    private fun observableViewModel() {

        viewModel.pokeListResponse.observe(this) {

            list = it
            Log.v("lista_retrofit_usuarios", it.toString())
            val adapter =PokeAdapter(it)
            recyclerPokemon.adapter = adapter
            recyclerPokemon.layoutManager = LinearLayoutManager(this)

        }


    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA


}