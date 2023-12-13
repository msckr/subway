package com.example.subway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.subway.databinding.ActivityAccBinding

class acc : AppCompatActivity() {
    lateinit var binding : ActivityAccBinding
    lateinit var stateNm : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccBinding.inflate(layoutInflater)

        val report =intent.getSerializableExtra("list") as ArrayList<List<RealtimeArrival>>
        binding.recyclerView.adapter = Adapter(report)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.back.setOnClickListener{
            val nextIntent = Intent(this, MainActivity::class.java)
            startActivity(nextIntent)
        }
        setContentView(binding.root)
    }
}