package com.dicoding.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter (private val  historyList:ArrayList<History>)
    : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>()
{
    class HistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tanggal : TextView = itemView.findViewById(R.id.tanggal)
        val menit : TextView = itemView.findViewById(R.id.menit)
        val description : TextView = itemView.findViewById(R.id.keterangan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_riwayat, parent, false)
        return HistoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return historyList.size
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val history = historyList[position]
        holder.tanggal.text = history.tanggal
        holder.description.text = history.desc
        holder.menit.text = history.menit
    }
}