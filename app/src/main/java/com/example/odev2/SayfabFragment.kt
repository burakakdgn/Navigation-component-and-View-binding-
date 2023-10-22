package com.example.odev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev2.databinding.FragmentSayfaBBinding

class SayfabFragment : Fragment() {

    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)


        binding.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.fragment_Y1)
        }

        return binding.root



    }


}