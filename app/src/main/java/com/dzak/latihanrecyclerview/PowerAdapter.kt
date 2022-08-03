package com.dzak.latihanrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dzak.latihanrecyclerview.databinding.FlowerItemBinding

class PowerAdapter(private val flowerList : Array<String>) : RecyclerView.Adapter<PowerAdapter.ViewHolder>() {

    class ViewHolder(private val itemBinding : FlowerItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(word : String) {
            itemBinding.flowerText.text = word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = FlowerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val word = flowerList[position]
        holder.bind(word)
    }

    override fun getItemCount(): Int {
        return flowerList.size
    }

}