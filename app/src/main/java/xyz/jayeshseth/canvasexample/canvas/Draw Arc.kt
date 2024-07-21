package xyz.jayeshseth.canvasexample.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
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
fun DrawArc() {
    val color = MaterialTheme.colorScheme.primary
    val gradientColor =
        listOf(MaterialTheme.colorScheme.primary, MaterialTheme.colorScheme.primaryContainer)
    val canvasSize = 300.dp

    val textModifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    val textStyle = MaterialTheme.typography.titleLarge

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
            )
            .padding(bottom = 20.dp)
            .navigationBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Arc",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(canvasSize)
        ) {
            drawArc(
                color = color,
                startAngle = 0f,
                sweepAngle = 270f,
                useCenter = true,
            )
        }

        Text(
            text = "Arc Not Relative to Center",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawArc(
                color = color,
                startAngle = 0f,
                sweepAngle = 270f,
                useCenter = false,
            )
        }

        Text(
            text = "Outlined Arc",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawArc(
                color = color,
                startAngle = 0f,
                sweepAngle = 270f,
                useCenter = true,
                style = Stroke(
                    width = 14f
                ),
            )
        }

        Text(
            text = "Color Filter Arc",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawArc(
                color = color,
                startAngle = 0f,
                sweepAngle = 270f,
                useCenter = true,
                colorFilter = ColorFilter.tint(Color.Cyan, BlendMode.ColorDodge)
            )
        }

        Text(
            text = "Center Offset Arc",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawArc(
                color = color,
                startAngle = 0f,
                sweepAngle = 270f,
                useCenter = true,
                topLeft = Offset(x = 150.dp.toPx(), y = 150.dp.toPx())
            )
        }

        Text(
            text = "Gradient Arc",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawArc(
                brush = Brush.linearGradient(
                    colors = gradientColor
                ),
                startAngle = 0f,
                sweepAngle = 270f,
                useCenter = true,
            )
        }
    }
}