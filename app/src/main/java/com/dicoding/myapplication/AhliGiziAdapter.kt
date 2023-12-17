package com.dicoding.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AhliGiziAdapter(private val  ahliGiziList:ArrayList<AhliGizi>)
    : RecyclerView.Adapter<AhliGiziAdapter.AhliGiziViewHolder>() {
    class AhliGiziViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
        val description : TextView = itemView.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AhliGiziViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ahli_gizi, parent, false)
        return AhliGiziViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ahliGiziList.size
    }

    override fun onBindViewHolder(holder: AhliGiziViewHolder, position: Int) {
        val food = ahliGiziList[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.name
        holder.description.text = food.desc
    }
}