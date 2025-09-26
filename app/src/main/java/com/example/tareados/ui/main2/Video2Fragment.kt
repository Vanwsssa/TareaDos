package com.example.tareados.ui.main2

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.Fragment
import com.example.tareados.R
import com.example.tareados.databinding.FragmentVideo2Binding

class VideoFragment2 : Fragment() {

    private var _binding: FragmentVideo2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideo2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Video desde carpeta raw
        val videoUri = Uri.parse("android.resource://${requireContext().packageName}/${R.raw.videodos}")
        binding.videoView.setVideoURI(videoUri)

        // Controles de reproducción
        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        // Inicia automáticamente
        binding.videoView.start()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
