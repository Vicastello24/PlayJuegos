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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
fun New_Player (NavController: NavHostController,modifier: Modifier = Modifier) {
    when (LocalConfiguration.current.orientation){
        Configuration.ORIENTATION_LANDSCAPE->{

        }
    }
    var estadoOutlined by remember { mutableStateOf(" ") }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFB6FAB9))
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Row {
            Image(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "Account",
                modifier = Modifier.requiredSize(75.dp)

            )
            OutlinedTextField(
                value = estadoOutlined,
                onValueChange = { estadoOutlined = it },
                label = { Text(text = "Nombre") },
                modifier = Modifier.padding(10.dp)
                    .width(250.dp)
                    .height(60.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Yellow,
                    unfocusedBorderColor = Color.Green
                ))
        }
        Row {
            Spacer(modifier = Modifier.width(74.dp)
            )
            OutlinedTextField(
                    value = estadoOutlined,
                    onValueChange = { estadoOutlined = it },
                    label = { Text(text = "Apellidos") },
                    modifier = Modifier.padding(10.dp)
                        .width(250.dp)
                        .height(60.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Yellow,
                        unfocusedBorderColor = Color.Green
                    ))
        }
        Row {
            Spacer(modifier = Modifier.width(74.dp)
            )
            OutlinedTextField(
                value = estadoOutlined,
                onValueChange = { estadoOutlined = it },
                label = { Text(text = "Nickname") },
                modifier = Modifier.padding(10.dp)
                    .width(250.dp)
                    .height(60.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Yellow,
                    unfocusedBorderColor = Color.Green
                ))
        }
        Row {
            Spacer(
                modifier = Modifier.width(50.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.android),
                contentDescription = "Account",
                modifier = Modifier.requiredSize(75.dp)
            )
            Spacer(modifier = Modifier.width(35.dp))
            Button(
                onClick = {}, modifier = Modifier
                    .width(115.dp)
                    .padding(5.dp)
                    .height(35.dp)
                    .offset(x = 0.dp, y = 15.dp),
                shape = RoundedCornerShape(1.dp),
                colors = ButtonColors(
                    Color.Yellow,
                    Color.Black,
                    Color.Yellow,
                    Color.Yellow
                )
            ) {
                Text(text = "Change")
            }
        }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = "Camera",
                    modifier = Modifier.requiredSize(75.dp)
                )
                OutlinedTextField(
                    value = estadoOutlined,
                    onValueChange = { estadoOutlined = it },
                    label = { Text(text = "Telefono") },
                    modifier = Modifier.padding(10.dp)
                        .width(250.dp)
                        .height(60.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Yellow,
                        unfocusedBorderColor = Color.Green
                    ))
                }
        Row {
            Image(
                painter = painterResource(id = R.drawable.email),
                contentDescription = "Email",
                modifier = Modifier.requiredSize(75.dp)
            )
            OutlinedTextField(
                value = estadoOutlined,
                onValueChange = { estadoOutlined = it },
                label = { Text(text = "Email") },
                modifier = Modifier.padding(10.dp)
                    .width(250.dp)
                    .height(60.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Yellow,
                    unfocusedBorderColor = Color.Green
                ))
        }
            }


}



