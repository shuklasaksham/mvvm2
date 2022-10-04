package com.example.mvvm2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val repository: MainRepository) : ViewModel() {

    private val _movieList = MutableLiveData<List<Movie>>()
    val movieList = _movieList

    val errorMessage = MutableLiveData<String>()

    fun getAllMovies() = viewModelScope.launch {
        val response = repository.getAllMovies()
        movieList.postValue(response)

    }
}
