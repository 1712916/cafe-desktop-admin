package presentation.home.compose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.onClick
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import compose.panel.ViewSize
import compose.panel.ViewSizeBuilderTemplate
import presentation.navigation.AppNavigation


/*
* Menu in this app: (and this item is shown by authorization)
* - Home
* - Setting
* - Product
* - Recipe
* - Ingredient
* - Inventory
* - Order
* - User Management
* - Dashboard
* */

abstract class MenuItem : ViewSizeBuilderTemplate {
    companion object {

        /*
        * Config menu follows by authorization
        * Handle on tap item
        * */
        fun menuList(): List<MenuItem> {
            //get roles and check item will be shown in the menu
            return listOf(
                HomeItem(),
                SettingItem(),
                ProductItem(),
                RecipeItem(),
                IngredientItem(),
                InventoryItem(),
                OrderItem(),
                UserManagementItem(),
                DashboardItem()
            )
        }
    }
}

class HomeItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Home")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Home, contentDescription = "Home Menu")
            Text("Home")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Home")
    }
}

class SettingItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Setting")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Settings, contentDescription = "Settings Menu")
            Text("Setting")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Setting")
    }
}

class ProductItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Product")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.ShoppingCart, contentDescription = "Product Menu")
            Text("Product")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Product")
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    override fun build(viewSize: ViewSize) {
        Box(modifier = Modifier.onClick {
            AppNavigation.navTo("product")
        }) {
            super.build(viewSize)
        }
    }
}

class RecipeItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Recipe")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Settings, contentDescription = "Recipe Menu")
            Text("Recipe")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Recipe")
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    override fun build(viewSize: ViewSize) {
        Box(modifier = Modifier.onClick {
            AppNavigation.navTo("recipe")
        }) {
            super.build(viewSize)
        }
    }
}

class IngredientItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Ingredient")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Settings, contentDescription = "Ingredient Menu")
            Text("Ingredient")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Ingredient")
    }
}

class InventoryItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Inventory")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Settings, contentDescription = "Inventory Menu")
            Text("Inventory")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Inventory")
    }
}

class OrderItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Order")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Settings, contentDescription = "Order Menu")
            Text("Order")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Order")
    }
}

class UserManagementItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("User Management")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Settings, contentDescription = "User Management Menu")
            Text("User Management")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("User Management")
    }
}

class DashboardItem : MenuItem() {
    @Composable
    override fun buildSmall() {
        Text("Dashboard")
    }

    @Composable
    override fun buildMedium() {
        Row(modifier = Modifier) {
            Icon(Icons.Filled.Settings, contentDescription = "Dashboard Menu")
            Text("Dashboard")
        }
    }

    @Composable
    override fun buildLarge() {
        Text("Dashboard")
    }
}