package com.emmanuel_rono.composetut



import android.os.Build
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

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
    TextField(value = "Type Here ...", onValueChange ={} )
}
@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun PreviewGreeting()
{
    Greeting()
}













