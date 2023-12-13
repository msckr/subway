package com.example.subway

import java.io.Serializable


data class ApiSubway(
    val errorMessage: ErrorMessage,
    val realtimeArrivalList: List<RealtimeArrival>
) : Serializable