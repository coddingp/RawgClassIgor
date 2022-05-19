package com.example.rawgmy.main.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rawgmy.R
import com.example.rawgmy.model.MainItems

class MainAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val data = mutableListOf<MainItems>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            R.layout.item_game_big_icon -> GameWithBigIconViewHolder(parent)
            R.layout.item_game_small_icon -> GameWithSmallIconViewHolder(parent)
            R.layout.item_game_text -> GameWithTextViewHolder(parent)
            else -> throw IllegalStateException("Unknown view type")
        }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GameWithBigIconViewHolder -> holder.onBind(data[position] as MainItems.GameWithBigIcon)
            is GameWithSmallIconViewHolder -> holder.onBind(data[position] as MainItems.GameWithSmallIcon)
            is GameWithTextViewHolder -> holder.onBind(data[position] as MainItems.GameWithText)
        }
    }

    override fun getItemViewType(position: Int): Int =
        when (data[position]) {
            is MainItems.GameWithBigIcon -> R.layout.item_game_big_icon
            is MainItems.GameWithSmallIcon -> R.layout.item_game_small_icon
            is MainItems.GameWithText -> R.layout.item_game_text
        }


    override fun onViewRecycled(holder: RecyclerView.ViewHolder) {
        super.onViewRecycled(holder)
        when (holder) {
            is GameWithBigIconViewHolder -> holder.detach()
        }
    }

    override fun getItemCount() = data.size

    fun setItems(list: List<MainItems>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }
}