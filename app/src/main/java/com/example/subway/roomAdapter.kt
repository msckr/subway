package com.example.subway

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.subway.databinding.SubwayBinding

class roomAdapter(val context: Context, val subwayList: List<bookmark>) : RecyclerView.Adapter<roomAdapter.Holder>() {

    private lateinit var binding : SubwayBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = LayoutInflater.from(context).inflate(R.layout.subway,parent,false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return subwayList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(subwayList[position])
    }


    inner class Holder (itemView: View?) : RecyclerView.ViewHolder(itemView!!){
        val stateNm = itemView?.findViewById<TextView>(R.id.stateNm)
        val arriveTm = itemView?.findViewById<TextView>(R.id.arriveTm)
        val bookmark = itemView?.findViewById<CheckBox>(R.id.bookmark)

        fun bind(bookmark: bookmark){
            stateNm?.text  = bookmark.stateName
            arriveTm?.text = bookmark.stateName
            bookmark.isSelected = bookmark.isSelected
        }
    }
}