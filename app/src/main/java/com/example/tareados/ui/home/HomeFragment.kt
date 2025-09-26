package com.example.tareados.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tareados.MainActivity2
import com.example.tareados.R
import com.example.tareados.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Cargar la animación de fade_slide_up
        val anim = AnimationUtils.loadAnimation(requireContext(), R.anim.fade_slide_up)

        // Aplicar animación a las vistas
        binding.imageNina.startAnimation(anim)
        binding.textHome.startAnimation(anim)
        binding.subtextHome.startAnimation(anim)

        // Abrir MainActivity2 al hacer clic en la imagen con animación de transición
        binding.imageNina.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity2::class.java)
            startActivity(intent)
            requireActivity().overridePendingTransition(
                R.anim.slide_in_rigth,  // Entrada de MainActivity2
                R.anim.slide_out_left   // Salida de MainActivity
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
