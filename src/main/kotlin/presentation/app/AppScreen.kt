package presentation.app

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import compose.panel.TwoPanel
import compose.panel.control.ControlMenu
import presentation.app.compose.AppControlMenu
import presentation.app.compose.MasterView
import presentation.navigation.AppNavigation

/*
* Config template for desktop view: control panel and master view
* Config notifications to manage for all notifications
*
* */

@Preview
@Composable
fun AppScreen() {
    val navController = rememberNavController()
    AppNavigation.setNavAppController(navController)

    TwoPanel(controlView = {
        ControlMenu {
            AppControlMenu()
        }
    }, masterView = {
        MasterView()
    })
}

/*
* Create a shared data from [AppControlMenu] and [MasterView]
* */

