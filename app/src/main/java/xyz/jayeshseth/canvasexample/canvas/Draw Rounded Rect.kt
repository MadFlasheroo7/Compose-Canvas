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
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun DrawRoundedRect() {
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
            .padding(bottom = 20.dp)
            .navigationBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Filled Rounded Rect - Default Radius",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRoundRect(
                color = color,
            )
        }

        Text(
            text = "Filled Rounded Rect - (50f) Radius",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRoundRect(
                color = color,
                cornerRadius = CornerRadius(50f)
            )
        }

        Text(
            text = "OutLined Rounded Rectangle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRoundRect(
                color = color,
                cornerRadius = CornerRadius(50f),
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
            drawRoundRect(
                color = color,
                cornerRadius = CornerRadius(50f),
                colorFilter = ColorFilter.tint(Color.Blue, BlendMode.ColorDodge)
            )
        }

        Text(
            text = "Alpha Rounded Rectangle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRoundRect(
                color = color,
                cornerRadius = CornerRadius(50f),
                alpha = 0.5f
            )
        }

        Text(
            text = "Rounded Square",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(200.dp)
        ) {
            drawRoundRect(
                color = color,
                cornerRadius = CornerRadius(50f),
            )
        }
        Text(
            text = "Gradient Rounded Rectangle",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            drawRoundRect(
                cornerRadius = CornerRadius(50f),
                brush = Brush.linearGradient(
                    colors = gradientColor
                ),
            )
        }
    }
}