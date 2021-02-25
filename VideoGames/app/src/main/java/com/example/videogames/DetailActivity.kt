package com.example.videogames

import JsonKotlin_Base
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import coil.load
import com.example.videogames.request.DetailApi

class DetailActivity : AppCompatActivity() {

    private val retrofit= Retrofit.Builder().baseUrl("https://api.rawg.io/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val postsApi = retrofit.create(DetailApi::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val idd=intent.getStringExtra("id")

        val response = postsApi.getAllPosts(id =idd)
        response.enqueue(object: Callback<JsonKotlin_Base> {
            override fun onFailure(call: Call<JsonKotlin_Base>, t: Throwable) {
                Log.d("mistake",t.message.toString())
            }

            override fun onResponse(
                call: Call<JsonKotlin_Base>,
                response: Response<JsonKotlin_Base>
            ) {
                val imgLogo = findViewById<ImageView>(R.id.imageView) as ImageView
                imgLogo.load(response.body()!!.background_image) {
                    placeholder(R.drawable.ic_launcher_background)
                }
                val name = findViewById<TextView>(R.id.txtHeader) as TextView
                name.setText(response.body()!!.name)
                val released = findViewById<TextView>(R.id.txtReleased) as TextView
                released.setText(response.body()!!.released)
                val desc = findViewById<TextView>(R.id.txtDetails) as TextView
                desc.setText(response.body()!!.description)
            }

        })
    }


}