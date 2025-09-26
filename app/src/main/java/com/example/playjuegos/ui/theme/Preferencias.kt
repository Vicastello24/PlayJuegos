package com.example.playjuegos.ui.theme

import android.R.attr.onClick
import android.content.res.Configuration
import android.widget.Toast
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlin.math.ceil
import kotlin.math.floor

@Composable
fun Preferencias(NavController: NavHostController, modifier: Modifier = Modifier){
    when (LocalConfiguration.current.orientation){
        Configuration.ORIENTATION_LANDSCAPE->{

        }
    }
    var opcionSeleccionada by remember { mutableStateOf<String?>(null) }
    Box (modifier = Modifier.fillMaxSize()){
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFFB6FAB9)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,

            )
        {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Elige una opción",
                modifier = modifier, color = Color(0xFF000000),
                fontSize = 30.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
            )
        }
        Column( modifier = Modifier
            .fillMaxWidth()
            .padding( top = 16.dp), // margen izquierdo
            horizontalAlignment = Alignment.Start) {
            Spacer(modifier = Modifier.height(40.dp))
            val nombresJuegos = arrayOf("Angry Birds","Dragon Fly","Hill Climb Racing","Pocket Soccer","Radiant Defense","Ninja Jump","Air Control")
            OpcionesJuegos(
                nombresJuegos,
                opcionSeleccionada = opcionSeleccionada,
                onOpcionSeleccionada = { opcionSeleccionada = it }
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row(modifier = Modifier, Arrangement.Center) {
                val range = 0.0f..10.0f
                val steps = 10
                var selection by remember { mutableStateOf(50f) }
                Slider(
                    value = selection,
                    valueRange = range,
                    steps = steps,
                    onValueChange = { selection = it },
                    colors = SliderDefaults.colors(
                        thumbColor = Color(0xFF388E3C), // verde oscuro para el "punto"
                        activeTrackColor = Color(0xFF4CAF50), // verde medio para la parte recorrida
                        inactiveTrackColor = Color(0xFFC8E6C9), // verde clarito para lo no recorrido
                        activeTickColor = Color.White, // ticks blancos en la parte activa
                        inactiveTickColor = Color.White,
                        )
                )

            }
            Row {
                RatingBar()
            }
        }


        var context = LocalContext.current

        FloatingActionButton(
            onClick = {
                val mensaje = opcionSeleccionada ?: "No has seleccionado nada"
                Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()
            },
            modifier = Modifier
                .align(BottomEnd)
                .padding(16.dp), // un poco de margen
            shape = RoundedCornerShape(90.dp)
        ) {
            Icon(Icons.Filled.Done, contentDescription = "Floating action button.")
        }
    }
}
@Composable
fun OpcionesJuegos(
    nombresJuegos: Array<String>,
    opcionSeleccionada: String?,
    onOpcionSeleccionada: (String) -> Unit
) {
    for (juego in nombresJuegos) {
        Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
            Spacer(modifier = Modifier.width(10.dp))
            RadioButton(
                selected = (opcionSeleccionada == juego),
                onClick = { onOpcionSeleccionada(juego) },
                colors = RadioButtonDefaults.colors(
                    Color(0xFF000000),Color(0xFF000000)
                )


            )
            Text(
                juego,
                fontSize = 20.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF000000)
            )
        }
    }
}
@Composable
fun RatingBar(
    modifier: Modifier = Modifier.fillMaxWidth(),
    rating: Double = 0.0,
    stars: Int = 10,
    starsColor: Color = Color.Yellow,
) {
    val filledStars = floor(rating).toInt()
    val unfilledStars = (stars - ceil(rating)).toInt()
    val halfStar = !(rating.rem(1).equals(0.0))
    Row(modifier = modifier) {
        repeat(filledStars) {
            Icon(imageVector = Icons.Outlined.Star,
                contentDescription = null, tint = starsColor)
        }
        if (halfStar) {
            Icon(
                imageVector = Icons.Outlined.Star,
                contentDescription = null,
                tint = starsColor
            )
        }
        repeat(unfilledStars) {
            Icon(
                imageVector = Icons.Outlined.Star,
                contentDescription = null,
                tint = Color.Black
            )
        }
    }
}
