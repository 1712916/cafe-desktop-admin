package data.home

data class ProductModel(val id: Int?, val name: String?, val description: String?, val images: List<String>?)

data class CategoryModel(val id: Int?, val name: String?)

data class RecipeModel(val id: Int?, val name: String?, val description: String?)


data class ProductAndCategoryModel(
    val productId: Int? = null,
    val productName: String? = null,
    val productDescription: String? = null,
    val productImages: List<String>? = null,
    val categoryId: Int? = null,
    val categoryName: String? = null
)

data class ProductGroupByCategory(val category: CategoryModel, val productList: List<ProductModel>)