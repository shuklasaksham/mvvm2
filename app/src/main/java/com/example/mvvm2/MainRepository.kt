package com.example.mvvm2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainRepository(private val retrofitService: RetrofitService) {
    suspend fun getAllMovies() = withContext(Dispatchers.IO) {
        return@withContext retrofitService.getAllMovies()
    }
}