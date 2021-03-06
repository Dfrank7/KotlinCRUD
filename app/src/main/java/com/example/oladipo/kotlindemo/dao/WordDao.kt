package com.example.oladipo.kotlindemo.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.oladipo.kotlindemo.entity.Word

@Dao
interface WordDao {
    @Insert
    fun insert(word: Word)

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Query("DELETE FROM word_table")
    fun deleteAll()
}