package com.example.sportstrainer

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.sportstrainer.databinding.FragmentSportsBinding
import com.example.sportstrainer.adapter.SportCardAdapter

class SportFragment  : Fragment() {

    private var binding: FragmentSportsBinding? = null
    //private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentSportsBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.sportFragment = this
    }

    fun selectsport(){
        findNavController().navigate(R.id.action_sports_to_skills)
    }

}