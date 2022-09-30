package com.vishal.listadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class Adapter : ListAdapter<Dao, Adapter.ItemViewholder>(DiffCallback())  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
        return ItemViewholder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Adapter.ItemViewholder, position: Int) {
        holder.bind(getItem(position))
    }

    class ItemViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val aa = itemView.findViewById<TextView>(R.id.textt)
        fun bind(item: Dao) = with(itemView) {
            aa.text = item.text
            setOnClickListener {
                // TODO: Handle on click
            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<Dao>() {

    override fun areItemsTheSame(oldItem: Dao, newItem: Dao): Boolean {
        return oldItem?.text == newItem?.text
    }

    override fun areContentsTheSame(oldItem: Dao, newItem: Dao): Boolean {
        return oldItem == newItem
    }
}