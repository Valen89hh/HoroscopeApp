package com.valendev.horoscapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.valendev.horoscapp.R
import com.valendev.horoscapp.databinding.FragmentHoroscopeBinding
import com.valendev.horoscapp.databinding.FragmentLuckBinding


class LuckFragment : Fragment() {
    //Preparamos el binding en un fragmento
    private var _binding: FragmentLuckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}