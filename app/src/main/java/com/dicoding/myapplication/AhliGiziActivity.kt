package com.dicoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AhliGiziActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    private lateinit var ahliGiziList : ArrayList<AhliGizi>
    private  lateinit var ahliGiziAdapter: AhliGiziAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahli_gizi)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        ahliGiziList = ArrayList()

        ahliGiziList.add(AhliGizi(R.drawable.dokter, "Dr.Pawan", "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis."))
        ahliGiziList.add(AhliGizi(R.drawable.dokter3, "Dr.Wanitha", "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis."))
        ahliGiziList.add(AhliGizi(R.drawable.dokter2, "Dr.Udara", "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis."))
        ahliGiziList.add(AhliGizi(R.drawable.dokter, "Dr.Kim Jong Un", "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis."))


        ahliGiziAdapter = AhliGiziAdapter(ahliGiziList)
        recyclerView.adapter = ahliGiziAdapter
    }
}