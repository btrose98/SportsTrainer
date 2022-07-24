package com.example.sportstrainer.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sportstrainer.R
import com.example.sportstrainer.data.SkillsDataSource
import com.example.sportstrainer.model.Skill
import com.example.sportstrainer.ui.SkillsFragment

class SkillsCardAdapter (private val fragment: SkillsFragment, private val onItemClicked: (Skill) -> Unit): RecyclerView.Adapter<SkillsCardAdapter.SkillsCardViewHolder>() {

    private val skillsList = SkillsDataSource.hockeySkills

    class SkillsCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val skillImage: ImageView = view!!.findViewById(R.id.cardImageView)
        val skillName: TextView = view!!.findViewById(R.id.cardItemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsCardAdapter.SkillsCardViewHolder {
        val adapterLayout: View =
            LayoutInflater.from(parent.context).inflate(R.layout.grid_view_card_item, parent, false)

        return SkillsCardAdapter.SkillsCardViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: SkillsCardAdapter.SkillsCardViewHolder, position: Int) {
        // Get the data at the current position
        val skill = skillsList[position]
        holder.skillImage.setImageResource(skill.imageResourceId)
        holder.skillName.text = skill.name

        holder.itemView.setOnClickListener {
            onItemClicked(skill)
            NavHostFragment.findNavController(fragment).navigate(
                R.id.action_skills_to_workouts
            )
            Log.d("skillscardadapter", "${skill.name} was clicked")
        }
    }

    override fun getItemCount(): Int = skillsList.size
}