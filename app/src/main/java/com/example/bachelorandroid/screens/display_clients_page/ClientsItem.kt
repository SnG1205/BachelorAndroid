package com.example.bachelorandroid.screens.display_clients_page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bachelorandroid.data.Client
import com.example.bachelorandroid.util.UiEvent

@Composable
fun ClientsItem(
    client: Client,
) {
    Row(
        modifier = Modifier
            .padding(0.dp, 10.dp, 20.dp, 10.dp)
            .fillMaxSize(),
        Arrangement.Absolute.Left
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp, 0.dp, 5.dp, 0.dp)
                .width(30.dp)
                .height(30.dp)
        ) {
            Text(
                text = client.id.toString(),
                fontSize = 20.sp,
            )
        }
        Box(
            modifier = Modifier
                .width(105.dp)
                .height(30.dp)
                .padding(0.dp, 0.dp, 10.dp, 0.dp),
        ) {
            Text(
                text = client.firstName,
                fontSize = 20.sp,
            )
        }
        Box(
            modifier = Modifier
                .width(100.dp)
                .height(30.dp)
                .padding(0.dp, 0.dp, 10.dp, 0.dp),
        ) {
            Text(
                text = client.lastName,
                fontSize = 20.sp,
            )
        }
        Box(
            modifier = Modifier
                .width(100.dp)
                .height(30.dp)
                .padding(0.dp, 0.dp, 10.dp, 0.dp),
        ){
            Text(
                text = client.address!!,
                fontSize = 20.sp,
            )
        }
    }
}