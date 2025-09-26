package com.example.tareados.ui.main2

import android.os.Bundle
import android.widget.Toast
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tareados.databinding.FragmentInfo2Binding

class InfoFragment2 : Fragment() {

    private var _binding: FragmentInfo2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInfo2Binding.inflate(inflater, container, false)

        binding.checkTeeth.setOnCheckedChangeListener { _, isChecked ->
            if (!isChecked) {
                Toast.makeText(requireContext(), "No digas eso 😅", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
