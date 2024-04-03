package com.example.navpractice.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Screen1(navigateToScreen2: () -> Unit){
    var inputText by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Navigation App")
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(value = inputText, onValueChange = {
            inputText = it
        })
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = {
            println("TAPPED NAV")
            navigateToScreen2()
        }) {
            Text("GOTO NEXT SCREEN")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen1Preview(){
    Screen1({})
}
