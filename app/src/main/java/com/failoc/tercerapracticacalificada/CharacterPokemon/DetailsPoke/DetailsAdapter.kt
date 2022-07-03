package com.failoc.tercerapracticacalificada.CharacterPokemon.DetailsPoke

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.failoc.tercerapracticacalificada.CharacterPokemon.Types

class DetailsAdapter(val list: List<Types>): RecyclerView.Adapter<DetailsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DetailsViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        val poke = list[position]
        holder.bind(poke)
    }

    override fun getItemCount(): Int = list.size

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA
}