package com.failoc.tercerapracticacalificada.CharacterPokemon.DetailsPoke

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.failoc.tercerapracticacalificada.CharacterPokemon.Types
import com.failoc.tercerapracticacalificada.R
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity: AppCompatActivity() {

    private lateinit var viewModel: DetailsViewModel
    lateinit var list: List<Types>



    companion object {
        fun newInstance(): DetailsActivity = DetailsActivity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val actionBar = supportActionBar
        actionBar?.hide()



        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

        viewModel.PokemonDetails()

        observableViewModel()


    }

    private fun observableViewModel() {

        viewModel.pokeDetailsResponse.observe(this) {

            list = it
            Log.v("lista_retrofit_usuarios", it.toString())
            val adapter = DetailsAdapter(it)
            recyclerDetailsPokemon.adapter = adapter
            recyclerDetailsPokemon.layoutManager = LinearLayoutManager(this)

        }


    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA


}