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

interface ViewSizeBuilderTemplate {
    @Composable
    fun buildSmall()
    @Composable
    fun buildMedium()
    @Composable
    fun buildLarge()

    @Composable
    fun build(viewSize: ViewSize) {
        when (viewSize) {
            ViewSize.SMALL -> buildSmall()
            ViewSize.MEDIUM -> buildMedium()
            ViewSize.LARGE -> buildLarge()
        }
    }
}