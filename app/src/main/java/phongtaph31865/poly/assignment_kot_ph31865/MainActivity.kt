package phongtaph31865.poly.assignment_kot_ph31865

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import phongtaph31865.poly.assignment_kot_ph31865.login.Login_Screen
import phongtaph31865.poly.assignment_kot_ph31865.login.Register_Screen
import phongtaph31865.poly.assignment_kot_ph31865.navigation.BottomNavbar
import phongtaph31865.poly.assignment_kot_ph31865.navigation.Favorite_Screen
import phongtaph31865.poly.assignment_kot_ph31865.navigation.Home_Screen
import phongtaph31865.poly.assignment_kot_ph31865.navigation.Notification_Screen
import phongtaph31865.poly.assignment_kot_ph31865.navigation.Profile_Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Routes.Desti) {
               navigation(startDestination = Routes.Login, route = Routes.Desti){
                   composable(Routes.Login) { Login_Screen(navController) }
                   composable(Routes.Register) { Register_Screen(navController) }

               }
                composable(Routes.BottomNav) { BottomNavbar()}
//                composable(Routes.Home) { Home_Screen() }
//                composable(Routes.Favorite) { Favorite_Screen() }
//                composable(Routes.Notification) { Notification_Screen() }
//                composable(Routes.Profile) { Profile_Screen() }
            }
        }
    }


}
