package com.example.redapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que este sea el layout correcto

        // Inicializar la barra de herramientas
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Inicializar la vista de navegación inferior
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Cargar el fragmento por defecto (FeedFragment)
        loadFragment(FeedFragment())

        // Configurar el listener para la navegación
        bottomNav.setOnItemSelectedListener { item ->
            val selectedFragment = when (item.itemId) {
                R.id.nav_feed -> FeedFragment()
                R.id.nav_post -> PostFragment()
                R.id.nav_friends -> FriendsFragment()
                R.id.nav_messages -> MessagesFragment()
                else -> null
            }
            selectedFragment?.let { loadFragment(it) }
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        // Cambia el fragmento en el contenedor
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment) // Asegúrate de que este ID sea correcto
        transaction.commit()
    }
}