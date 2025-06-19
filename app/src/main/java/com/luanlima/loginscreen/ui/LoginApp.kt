package com.luanlima.loginscreen.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.luanlima.loginscreen.ui.composes.LoginAppAppBar
import com.luanlima.loginscreen.ui.helpers.Screens
import com.luanlima.loginscreen.ui.screens.LoginScreen
import com.luanlima.loginscreen.ui.theme.LoginScreenTheme
import androidx.compose.runtime.getValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginApp(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = Screens.valueOf(
        backStackEntry?.destination?.route ?: Screens.Login.name
    )
    LoginScreenTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                LoginAppAppBar(
                    screen = currentScreen,
                    navigateUp = { navController.navigateUp() },
                    canNavigateBack = navController.previousBackStackEntry != null
                )
            }
        ) {
            NavHost(
                navController = navController,
                startDestination = Screens.Login.name,
                modifier = Modifier.padding(it)
            ) {
                composable(route = Screens.Login.name) {
                    LoginScreen()
                }
            }
        }
    }
}