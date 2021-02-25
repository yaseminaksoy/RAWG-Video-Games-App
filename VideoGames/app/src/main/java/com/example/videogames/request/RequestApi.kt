package com.example.videogames.request


import Json4Kotlin_Base
import retrofit2.Call
import retrofit2.http.GET

interface RequestApi {
    @GET("games")
    fun getAllPosts(): Call<Json4Kotlin_Base>
}