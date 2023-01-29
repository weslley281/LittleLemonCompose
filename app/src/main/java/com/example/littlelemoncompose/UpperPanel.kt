package com.example.littlelemoncompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UpperPanel(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Litle Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14)
        )
        Text(
            stringResource(id = R.string.city),
            fontSize = 32.sp,
            color = Color(0xFFF4CE14)
        )
        Row() {
            Button(onClick = { /*TODO*/ },
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ) {
                Text(text = stringResource(id = R.string.order))
            }
        }
    }
}