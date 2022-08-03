package com.nandani.fragment_cycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.nandani.fragment_cycle.databinding.fragment2

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding: fragment2Binding
    lateinit var action :MainActivity


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
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_fragment2, container, false)
        arguments?.let {
            var testingValue = it.getString("Test")?:""
            binding.tv2.setText(testingValue)
        }
        return binding.root
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(action,"on start",Toast.LENGTH_LONG)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(action,"on resume",Toast.LENGTH_LONG)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(action,"on pause",Toast.LENGTH_LONG)
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(action,"on stop",Toast.LENGTH_LONG)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(action,"on destroy view",Toast.LENGTH_LONG)
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(action,"on destroy",Toast.LENGTH_LONG)
    }



    override fun onDetach() {
        super.onDetach()
        Toast.makeText(action,"ondetach",Toast.LENGTH_LONG)
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}