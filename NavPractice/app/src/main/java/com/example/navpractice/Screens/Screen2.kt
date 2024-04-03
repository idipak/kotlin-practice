package com.example.navpractice.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen2(navigateToFirst: () -> Unit, data: String){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Screen 2")
        Text(text = "Data from Screen 1 $data")

        Button(onClick = { /*TODO*/ }) {
            Text(text = "GO BACK")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen2Preview(){
    Screen2({}, data = "HELLO")
}