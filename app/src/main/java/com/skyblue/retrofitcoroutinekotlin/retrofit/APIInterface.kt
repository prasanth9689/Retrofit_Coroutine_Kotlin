package com.skyblue.retrofitcoroutinekotlin.retrofit

import com.skyblue.retrofitcoroutinekotlin.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface APIInterface {
    @GET("/todos/1")
    suspend fun getQuotes(): Response<Post>
}