package inc.fabudi.lists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.firstFragment,
                R.id.secondFragment,
                R.id.thirdFragment,
                R.id.fourthFragment,
                R.id.fifthFragment
            )
        )
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        setupActionBarWithNavController(navController, appBarConfiguration)
        navigationView.setupWithNavController(navController)
    }

}