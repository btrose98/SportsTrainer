package com.example.sportstrainer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportstrainer.adapter.SportCardAdapter
import com.example.sportstrainer.databinding.FragmentSportsBinding
import com.example.sportstrainer.model.Sport

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [sports.newInstance] factory method to
 * create an instance of this fragment.
 */
class SportsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var binding: FragmentSportsBinding? = null
    private lateinit var adapter: SportCardAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var sportList: ArrayList<Sport>

    lateinit var sportImage: Array<Int>
    lateinit var sportTitle: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sports, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding?.sportFragment = this
        dataInit()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.grid_recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = SportCardAdapter(sportList)
        recyclerView.adapter = adapter
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment sports.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            sports().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }

    private fun dataInit(){
        sportList = ArrayList<Sport>()

        sportImage = listOf<Int>(
            R.drawable.hockey,
            R.drawable.basketball,
            R.drawable.soccer,
            R.drawable.volleyball
        ).toTypedArray()

        sportTitle = listOf<String>(
            getString(R.string.Hockey),
            getString(R.string.Basketball),
            getString(R.string.Soccer),
            getString(R.string.Volleyball)
        ).toTypedArray()

        for(i in sportImage.indices){
            val sport = Sport(i, sportTitle[i], sportImage[i])
            sportList.add(sport)
        }

    }
}