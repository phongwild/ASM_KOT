package phongtaph31865.poly.assignment_kot_ph31865

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import phongtaph31865.poly.assignment_kot_ph31865.login.Login_Screen
import phongtaph31865.poly.assignment_kot_ph31865.login.Register_Screen
import phongtaph31865.poly.assignment_kot_ph31865.navigation.BottomNavbar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Routes.Login) {
                composable(Routes.Login){ Login_Screen(navController)}
                composable(Routes.Register){ Register_Screen(navController)}
                composable(Routes.BottomNav) { BottomNavbar() }
            }
        }
    }


}
