package com.example.subway

import androidx.room.Dao
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface Service {
    @GET("api/subway/494e584e4e686172373667644f5056/json/realtimeStationArrival/0/5/{stateNm}")
    fun getArrive(
        @Path("stateNm") stateNm : String
    ):Call<ApiSubway>


}