package compose.panel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize

@Composable
fun ViewSizeBuilder(builder: @Composable (viewSize: ViewSize) -> Unit) {
    var size by remember { mutableStateOf(IntSize.Zero) }
    val viewSize by remember { derivedStateOf { ViewSize.fromWindowSize(size) } }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .onSizeChanged { newSize ->
                size = newSize
            }
    ) {
        builder(viewSize)
    }
}