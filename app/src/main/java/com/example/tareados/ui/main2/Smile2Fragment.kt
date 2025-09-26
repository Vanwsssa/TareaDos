package com.example.tareados.ui.main2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.example.tareados.R
import com.example.tareados.databinding.FragmentSmile2Binding

class SmileFragment2 : Fragment() {

    private var _binding: FragmentSmile2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSmile2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Cargar animación
        val anim = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_slide_up)

        // Aplicar animación a la imagen y al texto
        binding.imageSmile.startAnimation(anim)
        binding.textSmile.startAnimation(anim)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
