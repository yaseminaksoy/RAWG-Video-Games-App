package com.example.videogames.request


import JsonKotlin_Base
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DetailApi {
    @GET("games/{id}")
    fun getAllPosts(@Path("id") id: String?): Call<JsonKotlin_Base>
}