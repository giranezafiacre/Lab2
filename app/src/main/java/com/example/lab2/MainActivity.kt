package com.example.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.RowScopeInstance.alignByBaseline
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab2.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2Theme() {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    var name by remember { mutableStateOf("") }
    var textFieldName by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        NameTextField(name = textFieldName, changed = { textFieldName = it })
        SayHi({ name = textFieldName })
        Image(
            painter = painterResource(id = R.drawable.aloharisha),
            contentDescription = stringResource(id = R.string.image1),
            modifier = Modifier
                .padding(top = 40.dp, bottom = 40.dp)
                .size(190.dp),

            )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Lab2blue)
        ) {
            MessageText(newName = name)
        }
    }
}

@Composable
fun SayHi(clicked: () -> Unit){
    Button(onClick= clicked) {
        Text(
            stringResource(id = R.string.buttonChange)
            //style = MaterialTheme.typography.h2
        )
    }
}

@Composable
fun NameTextField(name: String, changed: (String) ->Unit){
    TextField(
        value = name,
        label = {Text(stringResource(id = R.string.enterName))},
        onValueChange = changed,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp)
        //.clip(RoundedCornerShape(12.dp))
    )
}

@Composable
fun MessageText(newName: String){
    if(newName.isNotEmpty()) {
        Text(
            stringResource(R.string.greeting) + " " + newName,
            color = Color.White,
            //fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CMUTheme(darkTheme = false) {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun DarkDefaultPreview() {
    CMUTheme(darkTheme = true) {
        Greeting()
    }
}