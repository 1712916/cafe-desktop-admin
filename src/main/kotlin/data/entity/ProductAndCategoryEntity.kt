package data.entity

data class ProductAndCategoryEntity(
    val productId: Id? = null,
    val productName: String? = null,
    val productDescription: String? = null,
    val productImages: List<String>? = null,
    val categoryId: Int? = null,
    val categoryName: String? = null
)
