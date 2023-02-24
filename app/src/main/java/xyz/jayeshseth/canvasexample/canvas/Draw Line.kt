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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DrawLine() {
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
            .padding(bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Default Line",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawLine(
                start = Offset(size.width , 0f),
                end = Offset(0f, size.height),
                color = color,
            )
        }

        Text(
            text = "Line - Width (50f)",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawLine(
                start = Offset(size.width , 0f),
                end = Offset(0f, size.height),
                strokeWidth = 50f,
                color = color,
            )
        }

        Text(
            text = "Line - Width (50f) - Rounded",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawLine(
                start = Offset(size.width , 0f),
                end = Offset(0f, size.height),
                strokeWidth = 50f,
                color = color,
                cap = StrokeCap.Round
            )
        }

        Text(
            text = "Line - Path Effect",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            val pathEffect = PathEffect.dashPathEffect(floatArrayOf(55f, 55f), 10f)
            drawLine(
                start = Offset(size.width , 0f),
                end = Offset(0f, size.height),
                strokeWidth = 50f,
                pathEffect = pathEffect,
                color = color,
            )
        }

        Text(
            text = "Gradient Line",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier.size(canvasSize)
        ) {
            drawLine(
                start = Offset(size.width , 0f),
                end = Offset(0f, size.height),
                strokeWidth = 50f,
                brush = Brush.linearGradient(
                    gradientColor
                ),
            )
        }

        Text(
            text = "X-O Board Using Canvas",
            modifier = textModifier,
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(canvasSize)
        ) {
            drawLine(
                start = Offset(size.width / 3, 0f),
                end = Offset(size.width / 3, size.height),
                strokeWidth = 50f,
                color = color,
            )
            drawLine(
                start = Offset(size.width / 1.5f, 0f),
                end = Offset(size.width / 1.5f, size.height),
                strokeWidth = 50f,
                color = color,
            )

            // Why run when you can fly
            rotate(90f) {
                drawLine(
                    start = Offset(size.width / 3, 0f),
                    end = Offset(size.width / 3, size.height),
                    strokeWidth = 50f,
                    color = color,
                )
                drawLine(
                    start = Offset(size.width / 1.5f, 0f),
                    end = Offset(size.width / 1.5f, size.height),
                    strokeWidth = 50f,
                    color = color,
                )
            }
        }

    }
}

@Preview
@Composable
fun PreviewDrawLine() {
    DrawLine()
}