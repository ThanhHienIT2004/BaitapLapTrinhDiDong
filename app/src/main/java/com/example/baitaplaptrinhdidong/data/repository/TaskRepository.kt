package com.example.baitaplaptrinhdidong.data.repository

import com.example.baitaplaptrinhdidong.data.models.BaseResponse
import com.example.baitaplaptrinhdidong.data.models.Task
import retrofit2.Response

class TaskRepository(
    private val api: ITaskRepository
): ITaskRepository {
    override suspend fun getTasks(): Response<BaseResponse<List<Task>>> {
        return api.getTasks()
    }

    override suspend fun getTask(taskId: Int): Response<BaseResponse<Task>> {
        return api.getTask(taskId)
    }
}