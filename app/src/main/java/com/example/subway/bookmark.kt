package com.example.subway

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_bookmark")
data class bookmark (
    @PrimaryKey
    var stateName : String,
    val arvtime : String,
    var isSelected : Boolean = false
)

