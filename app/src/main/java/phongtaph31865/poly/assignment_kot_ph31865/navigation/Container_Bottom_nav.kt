package phongtaph31865.poly.assignment_kot_ph31865.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import phongtaph31865.poly.assignment_kot_ph31865.Screens_nav
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.White
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.defaultIconColor
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.selectedIconColor

@Composable
fun BottomNavbar() {
    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = White
            ) {
                IconButton(onClick = {
                    selected.value = Icons.Default.Home
                    navController.navigate(Screens_nav.Home.screen) {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        tint = if (selected.value === Icons.Default.Home) selectedIconColor  else defaultIconColor
                    )
                }
                IconButton(onClick = {
                    selected.value = Icons.Default.Favorite
                    navController.navigate(Screens_nav.Favorite.screen) {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Favorite,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        tint = if (selected.value === Icons.Default.Favorite) selectedIconColor  else defaultIconColor
                    )
                }
                IconButton(onClick = {
                    selected.value = Icons.Default.Notifications
                    navController.navigate(Screens_nav.Notification.screen) {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Notifications,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        tint = if (selected.value === Icons.Default.Notifications) selectedIconColor  else defaultIconColor
                    )
                }
                IconButton(onClick = {
                    selected.value = Icons.Default.Person
                    navController.navigate(Screens_nav.Profile.screen) {
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        tint = if (selected.value === Icons.Default.Person) selectedIconColor  else defaultIconColor
                    )
                }
            }
        }
    ) {
        paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens_nav.Home.screen,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens_nav.Home.screen) { Home_Screen() }
            composable(Screens_nav.Favorite.screen) { Favorite_Screen() }
            composable(Screens_nav.Notification.screen) { Notification_Screen() }
            composable(Screens_nav.Profile.screen) { Profile_Screen() }
        }
    }
}