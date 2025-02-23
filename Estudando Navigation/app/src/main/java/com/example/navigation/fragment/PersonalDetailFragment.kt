package com.example.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation.R
import com.example.navigation.model.PersonModel
import com.example.navigation.databinding.FragmentPersonDetailBinding
import com.example.navigation.extensions.text

class PersonalDetailFragment: Fragment() {

    private var _binding: FragmentPersonDetailBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View{
        _binding = FragmentPersonDetailBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener{
           val model =  PersonModel(
                name = binding.tilName.text,
                age = binding.tilAge.text.toInt()
            )
          val directions =  PersonalDetailFragmentDirections.goToAdressFragment(model)
            findNavController().navigate(directions)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}