package com.emmanuel_rono.composetut



import android.os.Build
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
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
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        TextField(value = "Type Here ...", onValueChange = {},
    label={
        Text(text="Name")
})}}

@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun PreviewGreeting()
{
    Greeting()
}













