package presentation.home.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import compose.panel.control.ControlMenu
import presentation.navigation.AppNavigation
import presentation.product.ProductScreen
import presentation.recipe.RecipeScreen


@Composable
fun MasterView() {
    NavHost(
        AppNavigation.getNavController(),
        startDestination = "product") {

        composable("product") {
                ProductScreen()
        }

        composable("recipe") {
            RecipeScreen()
        }
    }

}



