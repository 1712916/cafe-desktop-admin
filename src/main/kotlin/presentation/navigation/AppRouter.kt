package presentation.navigation

sealed interface AppRouter {
    fun routerName(): String

}

data object HomeRouter : AppRouter {
    override fun routerName(): String {
        return "/home"
    }
}

data object ProductRouter : AppRouter {
    override fun routerName(): String {
        return "/product"
    }
}

data object RecipeRouter : AppRouter {
    override fun routerName(): String {
        return "/recipe"
    }
}
