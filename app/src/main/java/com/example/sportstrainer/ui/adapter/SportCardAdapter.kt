package com.example.sportstrainer.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sportstrainer.R
import com.example.sportstrainer.data.SportsDataSource
import com.example.sportstrainer.model.Sport
import kotlin.coroutines.coroutineContext

class SportCardAdapter(private val onItemClicked: (Sport) -> Unit): RecyclerView.Adapter<SportCardAdapter.SportCardViewHolder>() {

    private val sportList = SportsDataSource.sports

    class SportCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val sportImage: ImageView = view!!.findViewById(R.id.cardImageView)
        val sportName: TextView = view!!.findViewById(R.id.cardItemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportCardViewHolder {
        val adapterLayout: View =
            LayoutInflater.from(parent.context).inflate(R.layout.grid_view_card_item, parent, false)

        return SportCardViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: SportCardViewHolder, position: Int) {
        // Get the data at the current position
        val sport = sportList[position]
        holder.sportImage.setImageResource(sport.imageResourceId)
        holder.sportName.text = sport.name

        holder.itemView.setOnClickListener {
            onItemClicked(sport)
            Log.d("sportscardadapter", "${sport.name} was clicked")
        }
    }

    override fun getItemCount(): Int = sportList.size

}