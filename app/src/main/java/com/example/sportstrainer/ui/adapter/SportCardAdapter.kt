package com.example.sportstrainer.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportstrainer.R
import com.example.sportstrainer.data.SportsDataSource

class SportCardAdapter(): RecyclerView.Adapter<SportCardAdapter.SportCardViewHolder>() {

    // Initialize the data using the List found in data/DataSource
    private val sportList = SportsDataSource.sports

    class SportCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        // Declare and initialize all of the list item UI components
        val sportImage: ImageView = view!!.findViewById(R.id.imageView)
        val sportName: TextView = view!!.findViewById(R.id.sportName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportCardViewHolder {
        // Inflate the layout
        var adapterLayout: View =
            LayoutInflater.from(parent.context).inflate(R.layout.grid_view_sport_item, parent, false)

        return SportCardViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: SportCardViewHolder, position: Int) {
        // Get the data at the current position
        var sport = sportList[position]
        // Set the image resource for the current sport
        holder.sportImage.setImageResource(sport.imageResourceId)
        // Set the text for the current sport's name
        holder.sportName.text = sport.name
    }

    override fun getItemCount(): Int = sportList.size

}