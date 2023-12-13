package com.example.subway

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [bookmark::class], version = 1)
abstract class roomDb : RoomDatabase(){
    abstract fun room() : room

    companion object {
        private var instance : roomDb? = null
        @Synchronized
        fun getInstance(context: Context): roomDb?{
            if(instance == null)
                synchronized(roomDb::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        roomDb::class.java,
                        "subway.db"
                    )
                        .build()
                }
            return instance
        }
        fun destroyInstance(){
            instance = null
        }
    }
}