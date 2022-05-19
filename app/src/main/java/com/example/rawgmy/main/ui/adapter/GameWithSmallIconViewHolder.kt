package com.example.rawgmy.main.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rawgmy.databinding.ItemGameSmallIconBinding
import com.example.rawgmy.model.MainItems

class GameWithSmallIconViewHolder(
    private val binding: ItemGameSmallIconBinding
) : RecyclerView.ViewHolder(binding.root) {

    constructor(parent: ViewGroup) : this(
        ItemGameSmallIconBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    fun onBind(item: MainItems.GameWithSmallIcon) {

    }
}