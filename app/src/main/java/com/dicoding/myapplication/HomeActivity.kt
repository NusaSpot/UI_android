package com.dicoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeActivity : AppCompatActivity() {

    private  lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<Food>
    private  lateinit var foodAdapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.pisang, "Pisang", "Sarapan"))
        foodList.add(Food(R.drawable.pisang, "Pisang Keju", "Makan Siang"))
        foodList.add(Food(R.drawable.pisang, "Salad Pisang", "Sarapan/Makan Siang"))
        foodList.add(Food(R.drawable.pisang, "Pisang Coklat", "Camilan"))


        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

    }

}