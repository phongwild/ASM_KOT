package phongtaph31865.poly.assignment_kot_ph31865

sealed class Screens_nav(val screen: String){
    data object Home: Screens_nav("home")
    data object Favorite: Screens_nav("favorite")
    data object Notification: Screens_nav("notification")
    data object Profile: Screens_nav("profile")
}