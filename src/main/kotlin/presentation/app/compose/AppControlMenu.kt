package presentation.app.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import compose.panel.control.ControlMenu

@Composable
fun AppControlMenu() {
    //this menu will be observed from the shared data
    val menuList: List<MenuItem> = MenuItem.menuList()

    ControlMenu {viewSize ->
        Column {
            menuList.map {
                it.build(viewSize)
            }
        }
    }
}
