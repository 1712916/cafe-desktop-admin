package presentation.navigation

import androidx.navigation.NavHostController

class AppNavigation {
    companion object {

        private  lateinit var appNavController: NavHostController

        fun setNavAppController(navController: NavHostController) {
            appNavController = navController
        }
        fun getNavController() : NavHostController {
            return  appNavController
        }

        fun navTo(name: String) {
            getNavController().navigate(name)
        }
    }
}