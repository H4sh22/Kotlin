package com.example.fithprackotlin

import retrofit2.http.GET


interface ApiService {
    @GET("products")
    suspend fun getProducts(): ApiResponse
}