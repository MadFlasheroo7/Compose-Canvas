package xyz.jayeshseth.canvasexample.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp


@Composable
fun DrawRect() {
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
            text = "Filled Rectangle",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRect(
                color = color,
            )
        }

        Text(
            text = "OutLined Rectangle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRect(
                color = color,
                style = Stroke(
                    width = 14f
                ),
            )
        }

        Text(
            text = "Color Filter Rectangle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRect(
                color = color,
                colorFilter = ColorFilter.tint(Color.Blue, BlendMode.ColorDodge)
            )
        }

        Text(
            text = "Alpha Rectangle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRect(
                color = color,
                alpha = 0.5f
            )
        }

        Text(
            text = "Square",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(200.dp)
        ) {
            drawRect(
                color = color,
            )
        }
        Text(
            text = "Gradient Rectangle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRect(
                brush = Brush.linearGradient(
                    colors = gradientColor
                ),
            )
        }
    }
}