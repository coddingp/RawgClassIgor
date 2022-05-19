package com.example.rawgmy.main.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rawgmy.databinding.ItemGameBigIconBinding
import com.example.rawgmy.model.MainItems

class GameWithBigIconViewHolder(
    private val binding: ItemGameBigIconBinding
) : RecyclerView.ViewHolder(binding.root) {

    constructor(parent: ViewGroup) : this(
        ItemGameBigIconBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    fun onBind(item: MainItems.GameWithBigIcon) {

    }

    fun detach() {
        Glide.with(itemView.context).clear(binding.imageView)
    }
}