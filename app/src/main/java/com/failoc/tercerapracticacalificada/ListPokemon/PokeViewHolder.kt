package com.failoc.tercerapracticacalificada.ListPokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.failoc.tercerapracticacalificada.Pokemon
import com.failoc.tercerapracticacalificada.PokemonApi
import com.failoc.tercerapracticacalificada.R

class PokeViewHolder (inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_pokemon, parent, false)){

    private var textName: TextView? = null
    private var textUrl: TextView? = null

    init {
        textName = itemView.findViewById(R.id.textName)
        textUrl = itemView.findViewById(R.id.textUrl)
    }

    fun bind(poke: Pokemon){
        textName?.text = poke.name
        textUrl?.text = poke.url
    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA


}