package com.example.baitaplaptrinhdidong.data.network

import com.example.baitaplaptrinhdidong.data.repository.ITaskRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://amock.io/api/researchUTH/"

     val api : ITaskRepository by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ITaskRepository::class.java)
    }
}