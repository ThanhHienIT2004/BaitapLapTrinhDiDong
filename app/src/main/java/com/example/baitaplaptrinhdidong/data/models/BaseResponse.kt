package com.example.baitaplaptrinhdidong.data.models

data class BaseResponse<T>(
    val isSuccess: Boolean,
    val message: String,
    val data: T
)
