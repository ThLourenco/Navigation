package com.example.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigation.databinding.AdressFragmentBinding
import com.example.navigation.databinding.FragmentResumeBinding
import com.example.navigation.extensions.text
import com.example.navigation.model.PersonModel

class ResumeFragment: Fragment() {

    private var _binding: FragmentResumeBinding?=null
    private val binding get() = _binding!!

    private val args by navArgs<ResumeFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = AdressFragmentBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      binding.tvPersom.text = args.model.person
        binding.tvAddres.text = args.model.address

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}