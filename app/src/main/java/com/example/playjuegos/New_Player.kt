package com.example.playjuegos

import android.R.attr.name
import android.content.res.Configuration
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController



@Composable
fun New_Player (name: NavHostController,modifier: Modifier = Modifier) {
    when (LocalConfiguration.current.orientation){
        Configuration.ORIENTATION_LANDSCAPE->{

        }
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFB6FAB9)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Row {
            Box(modifier = Modifier.fillMaxSize()){
                Image(
                    painter = painterResource(id = R.drawable.account),
                    contentDescription = "Account",
                    modifier = Modifier.requiredSize(75.dp)
                        .absoluteOffset(x = 25.dp, y = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = "Account",
                    modifier = Modifier.requiredSize(75.dp)
                        .absoluteOffset(x = 135.dp, y = 270.dp)
                )

                var estadoOutlined by remember { mutableStateOf(" ") }
                OutlinedTextField(
                    value = estadoOutlined,
                    onValueChange = { estadoOutlined = it },
                    label = { Text(text = "Nombre") },
                    modifier = Modifier.padding(10.dp)
                        .width(250.dp)
                        .height(60.dp)
                        .absoluteOffset(x = 130.dp, y = 20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Yellow,
                        unfocusedBorderColor = Color.Green
                    ))
                OutlinedTextField(
                    value = estadoOutlined,
                    onValueChange = { estadoOutlined = it },
                    label = { Text(text = "Apellidos") },
                    modifier = Modifier.padding(10.dp)
                        .width(250.dp)
                        .height(60.dp)
                        .absoluteOffset(x = 130.dp, y = 100.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Yellow,
                        unfocusedBorderColor = Color.Green
                    ))
                OutlinedTextField(
                    value = estadoOutlined,
                    onValueChange = { estadoOutlined = it },
                    label = { Text(text = "Nickname") },
                    modifier = Modifier.padding(10.dp)
                        .width(250.dp)
                        .height(60.dp)
                        .absoluteOffset(x = 130.dp, y = 180.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Yellow,
                        unfocusedBorderColor = Color.Green
                    ))
                OutlinedTextField(
                    value = estadoOutlined,
                    onValueChange = { estadoOutlined = it },
                    label = { Text(text = "Telefono") },
                    modifier = Modifier.padding(10.dp)
                        .width(250.dp)
                        .height(60.dp)
                        .absoluteOffset(x = 130.dp, y = 350.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Yellow,
                        unfocusedBorderColor = Color.Green
                    ))
                Button(onClick = {},modifier = Modifier
                    .width(115.dp)
                    .padding(5.dp)
                    .height(35.dp)
                    .absoluteOffset(x = 230.dp, y = 285.dp), shape = RoundedCornerShape(1.dp), colors = ButtonColors(Color.Yellow,Color.Black,Color.Yellow,Color.Yellow)
                    ) {
                    Text(text = "Change")


                }
                Image(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = "Camera",
                    modifier = Modifier.requiredSize(75.dp)
                        .absoluteOffset(x = 25.dp, y = 355.dp)
                )
                OutlinedTextField(
                    value = estadoOutlined,
                    onValueChange = { estadoOutlined = it },
                    label = { Text(text = "Email") },
                    modifier = Modifier.padding(10.dp)
                        .width(250.dp)
                        .height(60.dp)
                        .absoluteOffset(x = 130.dp, y = 430.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Yellow,
                        unfocusedBorderColor = Color.Green
                    ))
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = "Email",
                    modifier = Modifier.requiredSize(75.dp)
                        .absoluteOffset(x = 25.dp, y = 435.dp)
                )
            }

        }
        var estadoOutlined by remember { mutableStateOf(" ") }
        OutlinedTextField(
            value = estadoOutlined,
            onValueChange = { estadoOutlined = it },
            label = { Text(text = "Hola") },
            modifier = Modifier.padding(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Yellow,
                unfocusedBorderColor = Color.Green
            ))
    }


}