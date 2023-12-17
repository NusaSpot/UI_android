package com.dicoding.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val  foodList:ArrayList<Food>)
        : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
        val description : TextView = itemView.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
      return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.name
        holder.description.text = food.desc
    }
}