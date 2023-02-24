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
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.unit.dp

@Composable
fun DrawPoints() {
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
            .padding(bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Points - Mode Polygon",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(canvasSize)
        ) {
            val points = listOf(
                Offset(size.width, 0f),
                Offset(size.width, size.height),
                Offset(0f, size.height),
                Offset(size.width, 0f),
            )
            drawPoints(
                points = points,
                strokeWidth = 15f,
                pointMode = PointMode.Polygon,
                color = color,
            )
        }

        Text(
            text = "Points - Mode Point",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(canvasSize)
        ) {
            val points = listOf(
                Offset(size.width, 0f),
                Offset(size.width, size.height),
                Offset(0f, size.height),
                Offset(size.width, 0f),
            )
            drawPoints(
                points = points,
                strokeWidth = 15f,
                pointMode = PointMode.Points,
                color = color,
            )
        }

        Text(
            text = "Points - Mode Lines",
            modifier = textModifier.statusBarsPadding(),
            style = textStyle
        )
        Canvas(
            modifier = Modifier
                .size(canvasSize)
        ) {
            val points = listOf(
                Offset(size.width, 0f),
                Offset(size.width, size.height),
                Offset(0f, size.height),
                Offset(size.width, 0f),
            )
            drawPoints(
                points = points,
                strokeWidth = 15f,
                pointMode = PointMode.Lines,
                color = color,
            )
        }

    }
}