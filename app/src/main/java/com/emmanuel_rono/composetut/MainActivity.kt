package com.emmanuel_rono.composetut



import android.os.Build
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text

import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
            }
        }
        }
@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun Greeting()
{
    Column(
        modifier= Modifier
            .fillMaxSize(),
        verticalArrangement=Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        var text by remember {
             mutableStateOf("Type here...") }
            TextField(value = text, onValueChange = { newText  ->
                text=newText
            },
                label = {
                    Text(text = "Name")
                },
              leadingIcon = {
                  IconButton(onClick = { /*TODO*/ }) {
                      IconButton(onClick = { /*TODO*/ }) {
                      Icon(
                          imageVector = Icons.Filled.Email,
                          contentDescription = "Email Icon"
                      )
                  }
              }},
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Check,
                                contentDescription = "Check Icon"
                            )
                        }
                    }}
            )
       }}
@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun PreviewGreeting()
{
    Greeting()
}













