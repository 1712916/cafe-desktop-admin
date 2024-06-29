package presentation

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import compose.panel.ViewSize
import compose.panel.ViewSizeBuilder

/*
* Config template for desktop view: control panel and master view
* Config notifications to manage for all notifications
* 
*
* */

@Preview
@Composable
fun HomeScreen() {
    Box() {
        ViewSizeBuilder {
            when (it) {
                ViewSize.SMALL -> Text("SMALL")
                ViewSize.MEDIUM -> Text("MEDIUM")
                ViewSize.LARGE -> Text("LARGE")
            }
        }
    }
}


