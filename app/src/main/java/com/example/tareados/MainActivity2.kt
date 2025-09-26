package com.example.tareados

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tareados.databinding.ActivityMain2Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_main2)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_smile,
                R.id.navigation_info,
                R.id.navigation_video
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Botón de regreso
        binding.btnRegresar.setOnClickListener {
            finish() // Cierra MainActivity2
            overridePendingTransition(
                R.anim.slide_in_left,   // Entrada de MainActivity
                R.anim.slide_out_right  // Salida de MainActivity2
            )
        }
    }
}
