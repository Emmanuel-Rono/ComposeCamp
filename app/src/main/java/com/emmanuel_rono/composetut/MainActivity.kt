package com.emmanuel_rono.composetut


import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier=Modifier.fillMaxSize(),
                color=MaterialTheme.colors.background){

            }
            }
        }
        }
@Composable
fun ColumnScope.uiTest(color: Color, weight:Float)

{
    Surface(
        modifier= Modifier
            .width(200.dp)
            .weight(3f)
            .height(50.dp),
        color=MaterialTheme.colors.primary
    ){

    }
}

@Composable
@Preview
fun PreviewCard() {
    MaterialTheme{
        Column(modifier=Modifier.fillMaxSize()){
            Surface(
                modifier= Modifier
                    .width(200.dp)
                    .weight(3f)
                    .height(50.dp),
                color=MaterialTheme.colors.primary
            ){
                uiTest(color = MaterialTheme.colors.primary, weight = 3f  )

            }
    }

}}











