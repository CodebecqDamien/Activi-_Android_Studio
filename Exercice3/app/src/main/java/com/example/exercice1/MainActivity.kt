package com.example.exercice1

import android.os.Bundle
import android.widget.ImageView
import android.widget.ToggleButton
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
        val imageView: ImageView = findViewById(R.id.imageView)
        val toggleButton: ToggleButton = findViewById(R.id.toggleButton2)

        // Listener pour changer l'image de la LED
        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Bouton ON : afficher la LED allumée
                imageView.setImageResource(R.drawable.led_on)
            } else {
                // Bouton OFF : afficher la LED éteinte
                imageView.setImageResource(R.drawable.led_off)
            }
        }
    }
}
