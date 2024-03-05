package com.tushar.navigationsample.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tushar.navigationsample.compose.dashboard.DashboardScreen
import com.tushar.navigationsample.compose.login.LoginScreen
import com.tushar.navigationsample.compose.registration.RegistrationScreen
import com.tushar.navigationsample.compose.registration.RegistrationViewModel
import com.tushar.navigationsample.compose.splash.SplashScreen
import com.tushar.navigationsample.compose.welcome.WelcomeScreen

@Composable
fun NavigationSampleApp() {
    NavigationSampleNavHost(
        navController = rememberNavController(),
    )
}

@Composable
fun NavigationSampleNavHost(navController: NavHostController) {

    val viewModel: RegistrationViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }

        composable(route = Screen.Registration.route) {
            RegistrationScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screen.Dashboard.route) {
            DashboardScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }

}

