package com.example.rawgmy.main.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rawgmy.databinding.ItemGameTextBinding
import com.example.rawgmy.model.MainItems

class GameWithTextViewHolder(
    private val binding: ItemGameTextBinding
) : RecyclerView.ViewHolder(binding.root) {

    constructor(parent: ViewGroup) : this(
        ItemGameTextBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    fun onBind(item: MainItems.GameWithText) {

    }
}