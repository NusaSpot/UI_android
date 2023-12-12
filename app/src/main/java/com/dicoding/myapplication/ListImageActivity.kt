package com.dicoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class ListImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_image)

        val gridView: GridView = findViewById(R.id.gridView)
        val adapter = GridViewAdapter(this)
        gridView.adapter = adapter
    }
}


