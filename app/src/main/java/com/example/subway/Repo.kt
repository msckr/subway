package com.example.subway

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log

class Repo {
    private val Dr = Retrofit
    fun getSubway(stateNm : String,param : GetDataCallBack<ApiSubway>){
        val call = Dr.service.getArrive(stateNm)
        call.enqueue(object : Callback<ApiSubway>{
            override fun onResponse(call: Call<ApiSubway>, response: Response<ApiSubway>) {
                param.onSuccess(response.body())
            }
            override fun onFailure(call: Call<ApiSubway>, t: Throwable) {
            }

        })
    }

    interface GetDataCallBack<T> {
        fun onSuccess(data:T?)
        fun onFailure()
    }
}