package com.example.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigation.databinding.AdressFragmentBinding
import com.example.navigation.databinding.FragmentPersonDetailBinding
import com.example.navigation.extensions.text
import com.example.navigation.model.PersonModel

class AdressFragment: Fragment() {

    private var _binding: AdressFragmentBinding?=null
    private val binding get() = _binding!!

    private val args by navArgs<AdressFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = AdressFragmentBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("TAG","onViewCreate: ${args.model}")

        binding.btnNext.setOnClickListener(){
          val model =  PersonModel(
                street = binding.tilStreet.text,
                number = binding.tilNumber.text.toInt()
            )
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}