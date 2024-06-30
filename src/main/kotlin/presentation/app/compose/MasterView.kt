package presentation.app.compose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import presentation.home.HomeScreen
import presentation.navigation.AppNavigation
import presentation.navigation.HomeRouter
import presentation.navigation.ProductRouter
import presentation.navigation.RecipeRouter
import presentation.product.ProductScreen
import presentation.recipe.RecipeScreen


@Composable
fun MasterView() {
    NavHost(
        AppNavigation.getNavController(),
        startDestination = HomeRouter.routerName()) {

        composable(HomeRouter.routerName()) {
            HomeScreen()
        }

        composable(ProductRouter.routerName()) {
                ProductScreen()
        }

        composable(RecipeRouter.routerName()) {
            RecipeScreen()
        }
    }

}



