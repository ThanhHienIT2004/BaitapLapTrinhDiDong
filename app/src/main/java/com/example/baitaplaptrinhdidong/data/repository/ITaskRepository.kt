package com.example.baitaplaptrinhdidong.data.repository

import com.example.baitaplaptrinhdidong.data.models.BaseResponse
import com.example.baitaplaptrinhdidong.data.models.Task
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ITaskRepository {
    @GET("tasks")
    suspend fun getTasks(): Response<BaseResponse<List<Task>>>

    @GET("task/{id}")
    suspend fun getTask(@Path("id") taskId: Int): Response<BaseResponse<Task>>
}