package com.example.subway

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.subway.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var stateNm : String
    private var db: roomDb? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var repo = Repo()
        val subwaylist = ArrayList<List<RealtimeArrival>>()
        val adapter = Adapter(subwaylist)
        val report = ArrayList<List<RealtimeArrival>>()
        binding.search.setOnClickListener{
            stateNm = binding.editText.text.toString().trim()
            repo.getSubway(stateNm,object : Repo.GetDataCallBack<ApiSubway>{
                override fun onSuccess(data: ApiSubway?) {
                    if (data != null) {
                        subwaylist.clear()
                        subwaylist.add(data.realtimeArrivalList)
                        report.add(data.realtimeArrivalList)
                        binding.recyclerView.adapter = adapter

                    }
                }
                override fun onFailure() {
                    Log.d("실패","실패")
                }

            })
        }
        binding.bookmark.setOnClickListener{
            Log.d("전송",report.toString())
            val nextIntent = Intent(this, acc::class.java)
            nextIntent.putExtra("list",report)
            startActivity(nextIntent)
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        setContentView(binding.root)
    }


}