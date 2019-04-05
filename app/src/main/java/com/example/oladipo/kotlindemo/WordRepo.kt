package com.example.oladipo.kotlindemo

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import com.example.oladipo.kotlindemo.dao.WordDao
import com.example.oladipo.kotlindemo.entity.Word

class WordRepo(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}