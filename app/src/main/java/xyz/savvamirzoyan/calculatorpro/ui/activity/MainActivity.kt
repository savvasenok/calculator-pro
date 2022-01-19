package xyz.savvamirzoyan.calculatorpro.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView
import xyz.savvamirzoyan.calculatorpro.R

class MainActivity : AppCompatActivity() {

    private val navigationController by lazy { findNavController(R.id.main_navigation_host_fragment) }
    private val appBarConfig by lazy { AppBarConfiguration(navigationController.graph) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupActionBarWithNavController(this, navigationController)
        NavigationUI.setupWithNavController(
            findViewById<NavigationView>(R.id.navigation_view),
            navigationController
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navigationController, appBarConfig)
    }
}