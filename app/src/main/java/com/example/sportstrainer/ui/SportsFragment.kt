package com.example.sportstrainer.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportstrainer.R
import com.example.sportstrainer.ui.adapter.SportCardAdapter
import com.example.sportstrainer.ui.viewmodel.SportsViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [sports.newInstance] factory method to
 * create an instance of this fragment.
 */
class SportsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val sportsViewModel: SportsViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sports, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.grid_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context,2)
        recyclerView.adapter = SportCardAdapter(this) {
            sportsViewModel.updateCurrentSport(it)
        }
    }
}