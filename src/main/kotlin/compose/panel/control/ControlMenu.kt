package compose.panel.control

import androidx.compose.runtime.Composable
import compose.panel.ViewSize
import compose.panel.ViewSizeBuilder

@Composable
fun ControlMenu(builder: @Composable (viewSize: ViewSize) -> Unit) {
    ViewSizeBuilder {
        builder(viewSize= it)
    }
}
