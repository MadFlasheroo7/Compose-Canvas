package xyz.jayeshseth.canvasexample

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

@Composable
fun CanvasScreen(
    navigateToDrawRect: () -> Unit,
    navigateToDrawArc: () -> Unit,
    navigateToDrawLine: () -> Unit,
    navigateToDrawRoundedRect: () -> Unit,
    navigateToDrawCircle: () -> Unit,
    navigateToDrawOval: () -> Unit,
    navigateToDrawPoints: () -> Unit,
    navigateToDrawPath: () -> Unit,
) {
    val btnHeight = 50.dp
    val navController = rememberNavController()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "Canvas in Compose",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                )
            },
            modifier = Modifier.windowInsetsPadding(WindowInsets(0.dp)),
        )
        Button(
            onClick = navigateToDrawRect,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawRect")
        }
        Button(
            onClick = navigateToDrawLine,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawLine")
        }
        Button(
            onClick = navigateToDrawRoundedRect,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawRoundedRect")
        }
        Button(
            onClick = navigateToDrawCircle,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawCircle")
        }
        Button(
            onClick = navigateToDrawOval,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawOval")
        }
        Button(
            onClick = navigateToDrawArc,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawArc")
        }
        Button(
            onClick = navigateToDrawPoints,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawPoints")
        }
        Button(
            onClick = navigateToDrawPath,
            modifier = Modifier
                .height(btnHeight)
                .fillMaxWidth()
        ) {
            Text(text = "drawPath")
        }
    }
}