package xyz.jayeshseth.canvasexample

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import xyz.jayeshseth.canvasexample.CanvasScreen
import xyz.jayeshseth.canvasexample.canvas.*

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "CANVAS_SCREEN"
    ) {
        composable("CANVAS_SCREEN") {
            CanvasScreen(
                navigateToDrawRect = { navController.navigate("DRAW_RECT") },
                navigateToDrawArc = { navController.navigate("DRAW_ARC") },
                navigateToDrawLine = { navController.navigate("DRAW_LINE") },
                navigateToDrawRoundedRect = { navController.navigate("DRAW_ROUNDED_RECT") },
                navigateToDrawCircle = { navController.navigate("DRAW_CIRCLE") },
                navigateToDrawOval = { navController.navigate("DRAW_OVAL") },
                navigateToDrawPoints = { navController.navigate("DRAW_POINTS") },
                navigateToDrawPath = { navController.navigate("DRAW_PATH") },
            )
        }
        composable("DRAW_RECT") {
            DrawRect()
        }
        composable("DRAW_LINE") {
            DrawLine()
        }
        composable("DRAW_ROUNDED_RECT") {
            DrawRoundedRect()
        }
        composable("DRAW_CIRCLE") {
            DrawCircle()
        }
        composable("DRAW_OVAL") {
            DrawOval()
        }
        composable("DRAW_POINTS") {
            DrawPoints()
        }
        composable("DRAW_PATH") {
            DrawPath()
        }
        composable("DRAW_ARC") {
            DrawArc()
        }
    }
}