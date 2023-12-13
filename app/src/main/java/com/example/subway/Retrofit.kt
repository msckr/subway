package com.example.subway

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private const val BaseUrl = "http://swopenapi.seoul.go.kr/"
    fun getApi() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val service : Service = getApi().create(Service::class.java)
}