package com.cansukahraman.todoapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation
import com.cansukahraman.todoapp.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): ConstraintLayout {

        // Inflate the layout for this fragment
        binding= FragmentHomePageBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_homePageFragment2_to_firstPageFragment2)

        }
        return binding.root


    }


}