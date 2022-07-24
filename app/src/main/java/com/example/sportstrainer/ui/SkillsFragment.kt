package com.example.sportstrainer.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportstrainer.R
import com.example.sportstrainer.ui.adapter.SportCardAdapter


/**
 * A simple [Fragment] subclass.
 * Use the [skills.newInstance] factory method to
 * create an instance of this fragment.
 */
class SkillsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skills, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding?.sportFragment = this

        recyclerView = view.findViewById(R.id.grid_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context,2)
//        recyclerView.adapter = SportCardAdapter()
    }
}