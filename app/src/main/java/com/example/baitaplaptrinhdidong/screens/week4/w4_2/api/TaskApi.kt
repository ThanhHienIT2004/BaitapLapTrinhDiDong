package com.example.baitaplaptrinhdidong.screens.week4.w4_2.api

import com.example.baitaplaptrinhdidong.screens.week4.w4_2.model.TaskResponse
import retrofit2.Response
import retrofit2.http.GET

interface TaskApi {
    @GET("researchUTH/tasks")
    suspend fun getTasks(): Response<TaskResponse> // Updated return type
}