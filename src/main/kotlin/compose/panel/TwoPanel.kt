package compose.panel

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TwoPanel(controlView: @Composable () -> Unit, masterView: @Composable () -> Unit) {
    //panel view
    Row {
        Box {
            controlView()
        }
        Box(
            modifier = Modifier.weight(1f).fillMaxSize()
        ) {
            masterView()
        }
    }
}


