package phongtaph31865.poly.assignment_kot_ph31865.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import phongtaph31865.poly.assignment_kot_ph31865.R
import phongtaph31865.poly.assignment_kot_ph31865.login.MainActivity
import phongtaph31865.poly.assignment_kot_ph31865.login.Register_Screen

class Container_navigation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "login" ){
                composable("login"){MainActivity()}
                composable("register"){Register_Screen()}
            }
        }
    }

}