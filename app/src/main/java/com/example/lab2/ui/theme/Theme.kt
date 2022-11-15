package com.example.lab2.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


val Lab2Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)
private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)
@SuppressLint("ConflictingOnColor")
private val Lab2LightColorPalette = lightColors(
    primary = Lab2blue,
    primaryVariant = Lab2blue,
    onPrimary = Color.White,
    secondary = Lab2blue
)

@Composable
fun Lab2Theme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val themeColors = if (darkTheme) {
        Lab2LightColorPalette  //use dark color palette here
    } else {
        Lab2LightColorPalette
    }
    MaterialTheme(
        colors = themeColors,
        typography = Lab2Typography,
        shapes = Lab2Shapes,
        content = content
    )
}
private val LABtwoLightColorPalette = lightColors(
    primary = LABtwored ,
    primaryVariant = LABtworedvariant,
    onPrimary = Color.White,
    secondary = LABtworeddark
)
val LABtwoTypography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)
@Composable
fun LABtwoTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit){
    val themeColors = if (darkTheme) {
        LABtwoLightColorPalette  //use dark color palette here
    } else {
        LABtwoLightColorPalette
    }
    MaterialTheme(
        colors = themeColors,
        typography = LABtwoTypography,
        shapes = LABtwoShapes,
        content = content
    )
}