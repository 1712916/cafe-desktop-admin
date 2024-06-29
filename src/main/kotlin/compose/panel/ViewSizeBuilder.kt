package compose.panel

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.runtime.*
import androidx.compose.ui.unit.IntSize

@Composable
fun ViewSizeBuilder(builder: @Composable (viewSize: ViewSize) -> Unit) {

    var size by remember { mutableStateOf(IntSize.Zero) }
    val viewSize by remember { derivedStateOf { ViewSize.fromWindowSize(size) } }

    BoxWithConstraints {
        size = IntSize(constraints.maxWidth, constraints.maxHeight)
        builder(viewSize)
    }
}