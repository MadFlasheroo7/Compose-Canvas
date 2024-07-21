package xyz.jayeshseth.canvasexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
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
    Column(
        modifier = Modifier
//            .fillMaxSize()
            .padding(horizontal = 24.dp)
            .systemBarsPadding(),
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
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(25.dp),
            modifier = Modifier
                .padding(top = 12.dp)
                .verticalScroll(rememberScrollState())
        ) {
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
}