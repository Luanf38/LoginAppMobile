package com.luanlima.loginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.luanlima.loginscreen.ui.composes.LoginAppAppBar
import com.luanlima.loginscreen.ui.helpers.Screens
import com.luanlima.loginscreen.ui.screens.LoginScreen
import com.luanlima.loginscreen.ui.theme.LoginScreenTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginApp(modifier: Modifier = Modifier) {
    LoginScreenTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                LoginAppAppBar(
                    screen = Screens.Login,
                    navigateUp = {},
                    canNavigateBack = true
                )
            }
        ) {
            LoginScreen(modifier = Modifier.padding(it))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginApp()
}