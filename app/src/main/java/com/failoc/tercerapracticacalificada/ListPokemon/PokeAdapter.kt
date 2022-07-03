package com.failoc.tercerapracticacalificada.ListPokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.failoc.tercerapracticacalificada.Pokemon

class PokeAdapter(val list: List<Pokemon>): RecyclerView.Adapter<PokeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PokeViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: PokeViewHolder, position: Int) {
        val poke = list[position]
        holder.bind(poke)
    }

    override fun getItemCount(): Int = list.size
}

//DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA