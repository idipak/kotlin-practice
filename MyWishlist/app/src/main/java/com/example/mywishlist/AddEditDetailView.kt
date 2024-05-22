package com.example.mywishlist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun  AddEditDetailView(
    id: Long,
    viewModel: WishViewModel,
    navController: NavController
){
    Scaffold(
        topBar = {
            AppBarView(
                title = if (id != 0L) stringResource(id = R.string.update_wish) else stringResource(
                    id = R.string.add_wish
                )
            )
        }) {
     Column(modifier = Modifier
         .padding(it)
         .wrapContentSize(),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
         ) {
         Spacer(modifier = Modifier.height(10.dp))
     }
    }
}

@Composable
fun WishTextField(
    label: String,
    value: String,
    onValueChanged: (String) -> Unit,
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChanged,
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text(text = label)
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
    )
//    OutlinedTextField(
//        value,
//        onValueChange = onValueChanged,
////        label = { Text(
////        text = label,
////        color = Color.Black,)},
//        modifier = Modifier.fillMaxWidth(),
//        keyboardsOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
//    )
}

@Preview
@Composable
fun WishTestFieldPreview(){
    WishTextField(label = "Test", value = "Value", onValueChanged = {

    })
}