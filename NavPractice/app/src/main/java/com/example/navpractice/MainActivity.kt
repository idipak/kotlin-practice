package com.example.navpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navpractice.Screens.RecipeScreen
import com.example.navpractice.Screens.Screen1
import com.example.navpractice.Screens.Screen2
import com.example.navpractice.ui.theme.NavPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    RecipeScreen()
                }
            }
        }
    }
}

@Composable
fun MyApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1"){
        composable("screen1"){
            Screen1(navigateToScreen2 = {
                print("TAPPING")
                navController.navigate("screen2")
            })
        }
        composable("screen2"){
            Screen2(navigateToFirst = {
                                      navController.navigate("screen1")
            }, data = "NAV ROUTE")
        }
    }
}