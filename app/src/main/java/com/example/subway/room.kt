package com.example.subway

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface room {
    @Query("SELECT * FROM table_bookmark")
    fun getAll(): List<bookmark>

    @Query("SELECT isSelected FROM table_bookmark WHERE stateName = :stateName")
    fun getbookmark(stateName : String) : Boolean

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveBookmark(bookmarkEntity: bookmark)

    @Delete
    fun deleteBookmark(bookmarkEntity: bookmark)

}