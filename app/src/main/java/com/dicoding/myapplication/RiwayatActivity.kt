package com.dicoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RiwayatActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    private lateinit var historyList : ArrayList<History>
    private  lateinit var historyAdapter: HistoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        historyList = ArrayList()

        historyList.add(History("22 Desember 2023", "Corem ipsum dolor sit amet,adipiscing elit.", "15 Min"))
        historyList.add(History("23 Desember 2023", "Corem ipsum dolor sit amet,adipiscing elit.", "20 Min"))
        historyList.add(History("24 Desember 2023", "Corem ipsum dolor sit amet,adipiscing elit.", "22 Min"))
        historyList.add(History("24 Desember 2023", "Corem ipsum dolor sit amet,adipiscing elit.", "25 Min"))
        historyList.add(History("01 Januari 2024", "Corem ipsum dolor sit amet,adipiscing elit.", "2 Hours"))
        historyList.add(History("03 Januari 2024", "Corem ipsum dolor sit amet,adipiscing elit.", "5 Hours"))
        historyList.add(History("06 Januari 2024", "Corem ipsum dolor sit amet,adipiscing elit.", "18 Hours"))


        historyAdapter = HistoryAdapter(historyList)
        recyclerView.adapter = historyAdapter
    }
}