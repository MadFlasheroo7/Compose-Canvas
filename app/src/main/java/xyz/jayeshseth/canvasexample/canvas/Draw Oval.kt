package xyz.jayeshseth.canvasexample.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun DrawOval() {
    val color = MaterialTheme.colorScheme.primary
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
            text = "Filled Oval",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
        ) {
            drawOval(
                color = color,
            )
        }

        Text(
            text = "OutLined Oval",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
        ) {
            drawOval(
                color = color,
                style = Stroke(
                    width = 14f
                ),
            )
        }

        Text(
            text = "Color Filter Oval",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
        ) {
            drawOval(
                color = color,
                colorFilter = ColorFilter.tint(Color.Blue, BlendMode.ColorDodge)
            )
        }

        Text(
            text = "Alpha Oval",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
        ) {
            drawOval(
                color = color,
                alpha = 0.5f
            )
        }

        Text(
            text = "Gradient Oval",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
        ) {
            drawOval(
                brush = Brush.linearGradient(
                    colors = gradientColor
                ),
            )
        }
    }
}