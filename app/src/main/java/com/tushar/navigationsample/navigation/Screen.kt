package com.tushar.navigationsample.navigation

sealed class Screen(val route: String) {
    data object Splash : Screen("splash_screen")
    data object Welcome : Screen("welcome_screen")
    data object Registration : Screen("registration_screen")
    data object Login : Screen("login_screen")
    data object Dashboard : Screen("dashboard_screen")
}