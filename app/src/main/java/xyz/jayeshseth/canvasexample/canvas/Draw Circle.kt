package xyz.jayeshseth.canvasexample.canvas

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun DrawCircle() {
    val color = MaterialTheme.colorScheme.primary
    val size = 200.dp
    val gradientColor =
        listOf(MaterialTheme.colorScheme.primary, MaterialTheme.colorScheme.primaryContainer)

    val textModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    val textStyle = MaterialTheme.typography.titleLarge

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
            )
            .padding(bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Filled Circle",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(size)
        ) {
            drawCircle(
                color = color,
            )
        }

        Text(
            text = "OutLined Circle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(size)
        ) {
            drawCircle(
                color = color,
                style = Stroke(
                    width = 14f
                ),
            )
        }

        Text(
            text = "Color Filter Circle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(size)
        ) {
            drawCircle(
                color = color,
                colorFilter = ColorFilter.tint(Color.Blue, BlendMode.ColorDodge)
            )
        }

        Text(
            text = "Alpha Circle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(size)
        ) {
            drawCircle(
                color = color,
                alpha = 0.5f
            )
        }

        Text(
            text = "Gradient Circle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(size)
        ) {
            drawCircle(
                brush = Brush.linearGradient(
                    colors = gradientColor
                ),
            )
        }
    }
}