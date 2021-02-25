package com.example.videogames.adapter

import Results
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.videogames.R
import coil.load
import com.example.videogames.DetailActivity

internal class CustomAdapter(
    val results: List<Results>,val activity: Activity
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v= LayoutInflater.from(p0?.context).inflate(R.layout.list_layout, p0, false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return results.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val result: Results=results[p1]
        p0?.txtName.setText(result.name)
        p0.imgLogo.load(result.background_image) {
            placeholder(R.drawable.ic_launcher_background)
        }
        p0?.txtReleased.setText(result.released)
        p0?.layout.setOnClickListener(View.OnClickListener {
            val intent= Intent(activity, DetailActivity::class.java)
            intent.putExtra("id", ""+result.id)


            activity.startActivity(intent)
        })
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val layout= itemView.findViewById(R.id.layout) as ConstraintLayout
        val txtName= itemView.findViewById(R.id.txtName) as TextView
        val txtReleased= itemView.findViewById(R.id.txtReleased) as TextView
        val imgLogo= itemView.findViewById(R.id.imgLogo) as ImageView

    }
}
