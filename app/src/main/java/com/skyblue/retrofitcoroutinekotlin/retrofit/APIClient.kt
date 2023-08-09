package com.skyblue.retrofitcoroutinekotlin.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    val baseUrl = "https://jsonplaceholder.typicode.com"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create()) // convert JSON object to Java object
            .build()
    }
}