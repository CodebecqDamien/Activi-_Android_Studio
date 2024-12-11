package com.example.exercice1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.exercice1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configurer la vue avec la liaison
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurer la barre d'outils
        setSupportActionBar(binding.toolbar)

        // Récupérer les éléments de l'interface
        val colorDisplay: View = findViewById(R.id.color_display)
        val btnRed: Button = findViewById(R.id.btn_red)
        val btnGreen: Button = findViewById(R.id.btn_green)
        val btnBlue: Button = findViewById(R.id.btn_blue)

        // Ajouter des actions aux boutons
        btnRed.setOnClickListener {
            colorDisplay.setBackgroundResource(R.drawable.android_red)
        }
        btnGreen.setOnClickListener {
            colorDisplay.setBackgroundResource(R.drawable.android_green)
        }
        btnBlue.setOnClickListener {
            colorDisplay.setBackgroundResource(R.drawable.android_blue)
        }
    }
}
