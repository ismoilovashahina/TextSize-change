package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TextChanger()
                    }
                }
            }
        }
    }

    @Composable
    fun TextChanger() {
        var textSize by remember { mutableStateOf(16.sp) }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    textSize *= 1.1f
                },
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text("Increase Text Size")
            }

            Button(
                onClick = {
                    textSize *= 0.9f
                },
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text("Decrease Text Size")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                "Hello, Jetpack Compose!",
                fontSize = textSize,
                modifier = Modifier.padding(8.dp)
            )
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun PreviewTextChanger() {
        TextChanger()
    }
}


