package com.headtopics.nesnednavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    navController:NavController
){

    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {

        Text(
            text = "WELLCOME",
            color = Color.Blue,
            fontSize = 44.sp,
            fontWeight = FontWeight.Bold)
        Text(
            modifier = Modifier.clickable {
                navController.navigate(AUTH_GRAPH_ROUTE)
            },
            text ="Login / Sign Up",
            color = Color.Red,
            fontWeight = FontWeight.Medium
        )
    }

}
