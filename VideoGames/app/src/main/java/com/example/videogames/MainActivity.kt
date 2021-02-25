package com.example.videogames

import Json4Kotlin_Base
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.videogames.adapter.CustomAdapter
import com.example.videogames.request.RequestApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private val retrofit= Retrofit.Builder().baseUrl("https://api.rawg.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    private val postsApi = retrofit.create(RequestApi::class.java)
    private val response = postsApi.getAllPosts()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print(response)
        setContentView(R.layout.activity_main)
        callGames()
    }
    fun callGames(){
        response.enqueue(object: Callback<Json4Kotlin_Base> {
            override fun onFailure(call: Call<Json4Kotlin_Base>, t: Throwable) {
                Log.d("mistake", t.message.toString())
            }

            override fun onResponse(
                    call: Call<Json4Kotlin_Base>,
                    response: Response<Json4Kotlin_Base>
            ) {
                val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)
                recyclerView.layoutManager= LinearLayoutManager(this@MainActivity)
                val adapter = CustomAdapter(response.body()!!.results,this@MainActivity)
                recyclerView.adapter=adapter
            }

        })
    }
}