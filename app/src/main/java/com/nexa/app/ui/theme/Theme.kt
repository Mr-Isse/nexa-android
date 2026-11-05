package com.nexa.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val NexaLightColorScheme = lightColorScheme(
    primary = NexaTeal,
    secondary = NexaNavy,
    background = NexaBackground,
    surface = androidx.compose.ui.graphics.Color.White
)

@Composable
fun NexaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = NexaLightColorScheme,
        content = content
    )
}
