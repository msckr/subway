package com.example.subway

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.subway.databinding.ActivityMainBinding
import com.example.subway.databinding.SubwayBinding


class Adapter(val subwayList: ArrayList<List<RealtimeArrival>>) : RecyclerView.Adapter<Adapter.Holder>() {

    interface OnItemClickListener{
        fun onItemClick(position: Int){}
    }
    var itemClickListener: OnItemClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = LayoutInflater.from(parent.context).inflate(R.layout.subway,parent,false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return subwayList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.stateNm.text = subwayList[position].get(0).statnNm
        holder.arriveTm.text = subwayList[position].get(0).arvlMsg2

    }

    inner class Holder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val stateNm = itemView.findViewById<TextView>(R.id.stateNm)
        val arriveTm = itemView.findViewById<TextView>(R.id.arriveTm)
        val bookmark = itemView.findViewById<CheckBox>(R.id.bookmark)

    }

}