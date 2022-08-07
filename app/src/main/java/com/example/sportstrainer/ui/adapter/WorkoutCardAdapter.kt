package com.example.sportstrainer.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sportstrainer.R
import com.example.sportstrainer.data.SkillsDataSource
import com.example.sportstrainer.data.WorkoutsDataSource
import com.example.sportstrainer.model.Workout
import com.example.sportstrainer.ui.WorkoutsFragment

class WorkoutCardAdapter (private val fragment: WorkoutsFragment, private val onItemClicked: (Workout) -> Unit): RecyclerView.Adapter<WorkoutCardAdapter.WorkoutsCardViewHolder>() {

    private val workoutList = WorkoutsDataSource.hockeySkateWorkout

    class WorkoutsCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val workoutImage: ImageView = view!!.findViewById(R.id.cardImageView)
        val workoutName: TextView = view!!.findViewById(R.id.cardItemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutCardAdapter.WorkoutsCardViewHolder {
        val adapterLayout: View =
            LayoutInflater.from(parent.context).inflate(R.layout.grid_view_card_item, parent, false)

        return WorkoutCardAdapter.WorkoutsCardViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: WorkoutCardAdapter.WorkoutsCardViewHolder, position: Int) {
        // Get the data at the current position
        val workout = workoutList[position]
//        holder.workoutImage.setImageResource(workout.imageResourceId)
        holder.workoutName.text = workout.name

        holder.itemView.setOnClickListener {
            onItemClicked(workout)
//            NavHostFragment.findNavController(fragment).navigate(
//                R.id.action_skills_to_workouts
//            )
            Log.d("Workoutcardadapter", "${workout.name} was clicked")
        }
    }

    override fun getItemCount(): Int = workoutList.size
}