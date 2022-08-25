package com.example.jetpack_compose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Blue

private val DarkColorPalette = darkColors(
    surface = PrimaryBG,
    onSurface = DarkBG,
    primary = PrimaryRed,
    onPrimary = White,
    primaryVariant = DarkRed

)

private val LightColorPalette = lightColors(
    surface = White,
    onSurface = PrimaryBG,
    primary = PrimaryRed,
    onPrimary = White,
    primaryVariant = PrimaryRedVariand

)

@Composable
fun Jetpack_composeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}