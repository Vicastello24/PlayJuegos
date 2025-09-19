package com.example.playjuegos

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.playjuegos.ui.theme.PlayJuegosTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlayJuegosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "Portada",
                        modifier = Modifier.padding(innerPadding)
                    )
                    {
                        composable("Portada") { Portada(navController) }
                        composable("New_Player") { New_Player(navController) }

                    }
                }
            }
        }
    }


    @Composable
    fun Portada(NavController : NavHostController, modifier: Modifier = Modifier) {
        when (LocalConfiguration.current.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                horizontal_view(NavController,"Play Juegos")
            }

            else -> {
                vertical_view(NavController,"Play Juegos")
            }
        }
    }

    @Composable
    fun vertical_view(navController : NavHostController,name: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFB6FAB9)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            )
        {

            Text(
                text = "$name",
                modifier = modifier, color = MaterialTheme.colorScheme.tertiary,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(
                modifier = modifier
                    .size(30.dp)
            )
            val buttonModifier = Modifier
                .fillMaxWidth(0.45f)
                .padding(5.dp)
                .height(35.dp)
            Button(
                onClick = {/**/ },
                modifier = buttonModifier,
                colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
            )
            {
                Text(text = "Play")
            }
            Button(
                onClick = {navController.navigate("New_Player") },
                modifier = buttonModifier,
                colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
            )
            {
                Text(text = "New Player")
            }
            Button(
                onClick = {},
                modifier = buttonModifier,
                colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
            )
            {
                Text(text = "Preferences")
            }
            Button(
                onClick = {/**/ },
                modifier = buttonModifier,
                colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
            )
            {
                Text(text = "About")
            }
        }
    }


    @Composable
    fun horizontal_view(navController : NavHostController,name: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFB6FAB9)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {

            Text(
                text = "$name",
                modifier = modifier, color = MaterialTheme.colorScheme.tertiary,
                style = MaterialTheme.typography.bodyLarge
            )


            val buttonModifier = Modifier
                .width(300.dp)
                .padding(5.dp)
                .height(35.dp)
            Row {
                Spacer(
                    modifier = modifier
                        .size(40.dp)
                )
                Button(
                    onClick = {/**/ },
                    modifier = buttonModifier,
                    colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
                )
                {
                    Text(text = "Play")
                }
                Button(
                    onClick = {/**/ },
                    modifier = buttonModifier,
                    colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
                )
                {
                    Text(text = "New Player")
                }
            }
            Row {
                Button(
                    onClick = {/**/ },
                    modifier = buttonModifier,
                    colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
                )
                {
                    Text(text = "Preferences")
                }
                Button(
                    onClick = {/**/ },
                    modifier = buttonModifier,
                    colors = ButtonDefaults.buttonColors(Color(0xFF5AA65D))
                )
                {
                    Text(text = "About")
                }
            }
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    PlayJuegosTheme {
//        Portada("Play Juegos")
//    }
//}