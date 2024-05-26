//package phongtaph31865.poly.assignment_kot_ph31865.navigation
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material3.BottomAppBar
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.NavigationBar
//import androidx.compose.material3.NavigationBarItem
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableIntStateOf
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import phongtaph31865.poly.assignment_kot_ph31865.Routes
//import phongtaph31865.poly.assignment_kot_ph31865.Screens_nav
//import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.White
//import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.defaultIconColor
//import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.selectedIconColor
//
////class Container_Bottom_nav: ComponentActivity(){
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContent {
////            BottomNavbar()
////        }
////    }
////}
//data class NavItem(
//    val route: String,
//    val icon: ImageVector,
//    val colorDefault: Color,
//    val selectedColor: Color
//)
//val bottomNavItem = listOf(
//    NavItem(
//        route = Routes.Home,
//        icon = Icons.Default.Home,
//        colorDefault = defaultIconColor,
//        selectedColor = selectedIconColor
//    ),
//    NavItem(
//        route = Routes.Favorite,
//        icon = Icons.Default.Favorite,
//        colorDefault = defaultIconColor,
//        selectedColor = selectedIconColor
//    ),
//    NavItem(
//        route = Routes.Notification,
//        icon = Icons.Default.Notifications,
//        colorDefault = defaultIconColor,
//        selectedColor = selectedIconColor
//    ),
//    NavItem(
//        route = Routes.Profile,
//        icon = Icons.Default.Person,
//        colorDefault = defaultIconColor,
//        selectedColor = selectedIconColor
//    ),
//)
//@Composable
//fun BottomNavbar(navController: NavController) {
//    val navController = rememberNavController()
//    val context = LocalContext.current.applicationContext
////    val selected = remember {
////        mutableStateOf(Icons.Default.Home)
////    }
//    var selected by remember {
//        mutableIntStateOf(0)
//    }
//    Scaffold(
//        bottomBar = {
//            NavigationBar {
//                bottomNavItem.forEachIndexed{index, bottomNavItems ->
//                    NavigationBarItem(
//                        selected = index == selected,
//                        onClick = {
//                            selected = index
//                            navController.navigate(bottomNavItems.route)
//                        },
//                        icon = {
//                            Icon(
//                                imageVector = bottomNavItems.icon,
//                                contentDescription = null,
//                                tint = if (index == selected) bottomNavItems.selectedColor else bottomNavItems.colorDefault)
//                        })
//                }
//            }
//        }
//    ){
//        val padding = it
//    }
//}