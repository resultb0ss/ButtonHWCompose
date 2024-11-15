package com.example.buttonhwcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            val colorContainerOne = remember { mutableStateOf(Color.Blue) }
            val colorContainerTwo = remember { mutableStateOf(Color.Blue) }
            val colorContainerThree = remember { mutableStateOf(Color.Blue) }

            val colorBorderOne = remember { mutableStateOf(Color.Green) }
            val colorBorderTwo = remember { mutableStateOf(Color.Green) }
            val colorBorderThree = remember { mutableStateOf(Color.Green) }

            val borderWidthOne = remember { mutableStateOf(6) }
            val borderWidthTwo = remember { mutableStateOf(6) }
            val borderWidthThree = remember { mutableStateOf(6) }

            val colorList = listOf<Color>(Color.Black,
                Color.DarkGray,
                Color.Cyan,
                Color.Green,
                Color.Magenta,
                Color.Yellow)



            Column (horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()
            ){

                Button(
                    onClick = {

                        colorContainerTwo.value = colorList.random()
                        colorBorderTwo.value = colorList.random()
                        borderWidthTwo.value = (1..5).random()

                        colorContainerThree.value = colorList.random()
                        colorBorderThree.value = colorList.random()
                        borderWidthThree.value = (1..5).random()


                    },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = colorContainerOne.value
                    ),
                    border = BorderStroke(borderWidthOne.value.dp, colorBorderOne.value),
                ) {
                    Text("Button1", fontSize = 28.sp)
                }

                Spacer(modifier = Modifier.padding(6.dp))

                Button(
                    onClick = {

                        colorContainerOne.value = colorList.random()
                        colorBorderOne.value = colorList.random()
                        borderWidthOne.value = (1..5).random()

                        colorContainerThree.value = colorList.random()
                        colorBorderThree.value = colorList.random()
                        borderWidthThree.value = (1..5).random()


                    },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = colorContainerOne.value
                    ),
                    border = BorderStroke(borderWidthOne.value.dp, colorBorderOne.value),
                ) {
                    Text("Button2", fontSize = 28.sp)
                }

                Spacer(modifier = Modifier.padding(6.dp))

                Button(
                    onClick = {

                        colorContainerTwo.value = colorList.random()
                        colorBorderTwo.value = colorList.random()
                        borderWidthTwo.value = (1..5).random()

                        colorContainerOne.value = colorList.random()
                        colorBorderOne.value = colorList.random()
                        borderWidthOne.value = (1..5).random()


                    },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = colorContainerThree.value
                    ),
                    border = BorderStroke(borderWidthThree.value.dp, colorBorderThree.value),
                ) {
                    Text("Button3", fontSize = 28.sp)
                }

                Spacer(modifier = Modifier.padding(6.dp))



            }
        }
    }
}

