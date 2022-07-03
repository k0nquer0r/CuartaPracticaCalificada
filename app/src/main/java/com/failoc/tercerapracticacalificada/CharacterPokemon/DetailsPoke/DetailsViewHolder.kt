package com.failoc.tercerapracticacalificada.CharacterPokemon.DetailsPoke

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.failoc.tercerapracticacalificada.CharacterPokemon.Types
import com.failoc.tercerapracticacalificada.R

class DetailsViewHolder (inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_details, parent, false)){

        private var textType: TextView? = null
        private var textCategoria: TextView? = null
        private var textUrl: TextView? = null

    init {
        textType = itemView.findViewById(R.id.textType)
        textCategoria = itemView.findViewById(R.id.textCategoria)
        textUrl = itemView.findViewById(R.id.textUrl)
    }

    fun bind(poke: Types){
        textType?.text = poke.slot.toString()
        textCategoria?.text = poke.type.toString()
    }

    //DESARROLLADO POR @FRANKLIN_FAILOC_VENTURA
}