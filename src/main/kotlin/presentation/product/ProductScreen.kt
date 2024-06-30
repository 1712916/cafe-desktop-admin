package presentation.recipe

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.home.CategoryModel
import data.home.ProductAndCategoryModel
import data.home.ProductGroupByCategory
import data.home.ProductModel
import presentation.product.compose.ListingProductViewData
import presentation.product.compose.ProductCard
import presentation.product.compose.ProductModelToProductView
import presentation.product.compose.ProductViewData

/*
* Listing product list
* -- category
* -- search
*
* Product detail
* --
*
* Management product
* --CRUD
*
* */

@OptIn(ExperimentalFoundationApi::class, ExperimentalLayoutApi::class)
@Composable
fun ProductScreen() {
    val productList = remember { mutableStateListOf<ProductViewData>() }


    val productGroupByCategory = remember { mutableStateListOf<ProductGroupByCategory>() }



    LaunchedEffect(Unit) {
        // Grouping the products by categories
        val productAndCategoryList = listOf(
            ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ),
            ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ),
            ProductAndCategoryModel(
                productId = 1,
                productName = "Product 1",
                productDescription = "Description for Product 1",
                productImages = listOf("image1a.jpg", "image1b.jpg"),
                categoryId = 101,
                categoryName = "Category 1"
            ), ProductAndCategoryModel(
                productId = 2,
                productName = "Product 2",
                productDescription = "Description for Product 2",
                productImages = listOf("image2a.jpg", "image2b.jpg"),
                categoryId = 102,
                categoryName = "Category 2"
            ), ProductAndCategoryModel(
                productId = 3,
                productName = "Product 3",
                productDescription = "Description for Product 3",
                productImages = listOf("image3a.jpg", "image3b.jpg"),
                categoryId = 103,
                categoryName = "Category 3"
            ), ProductAndCategoryModel(
                productId = 4,
                productName = "Product 4",
                productDescription = "Description for Product 4",
                productImages = listOf("image4a.jpg", "image4b.jpg"),
                categoryId = 104,
                categoryName = "Category 4"
            ), ProductAndCategoryModel(
                productId = 5,
                productName = "Product 5",
                productDescription = "Description for Product 5",
                productImages = listOf("image5a.jpg", "image5b.jpg"),
                categoryId = 105,
                categoryName = "Category 5"
            ), ProductAndCategoryModel(
                productId = 6,
                productName = "Product 6",
                productDescription = "Description for Product 6",
                productImages = listOf("image6a.jpg", "image6b.jpg"),
                categoryId = 106,
                categoryName = "Category 6"
            ), ProductAndCategoryModel(
                productId = 7,
                productName = "Product 7",
                productDescription = "Description for Product 7",
                productImages = listOf("image7a.jpg", "image7b.jpg"),
                categoryId = 107,
                categoryName = "Category 7"
            ), ProductAndCategoryModel(
                productId = 8,
                productName = "Product 8",
                productDescription = "Description for Product 8",
                productImages = listOf("image8a.jpg", "image8b.jpg"),
                categoryId = 108,
                categoryName = "Category 8"
            ), ProductAndCategoryModel(
                productId = 9,
                productName = "Product 9",
                productDescription = "Description for Product 9",
                productImages = listOf("image9a.jpg", "image9b.jpg"),
                categoryId = 109,
                categoryName = "Category 9"
            ), ProductAndCategoryModel(
                productId = 10,
                productName = "Product 10",
                productDescription = "Description for Product 10",
                productImages = listOf("image10a.jpg", "image10b.jpg"),
                categoryId = 110,
                categoryName = "Category 10"
            )
        )


        val groupedByCategory = productAndCategoryList.groupBy { it.categoryId }


// Creating the list of ProductGroupByCategory
        val productGroupByCategoryList = groupedByCategory.map { (categoryId, productAndCategoryList) ->
            val category = CategoryModel(id = categoryId, name = productAndCategoryList.first().categoryName)
            val productList = productAndCategoryList.map {
                ProductModel(
                    id = it.productId,
                    name = it.productName,
                    description = it.productDescription,
                    images = it.productImages
                )
            }
            ProductGroupByCategory(category = category, productList = productList)
        }

        productGroupByCategory.addAll(productGroupByCategoryList)
    }



    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {
                productList.add(
                    ListingProductViewData(
                        "Product name", "Product description", "Product image"
                    )
                )
            },
        ) {
            Text("add")
        }
    }) {
        LazyColumn(
        ) {

            productGroupByCategory.forEach { (cate, products) ->
                stickyHeader {
                    Text(cate.name ?: "")
                }
                item {
                    FlowRow(modifier = Modifier.padding(8.dp)) {
                        products.map {
                            ProductCard(product = ProductModelToProductView().mapping(it), onTap = {
                            })
                        }
                    }
                }

            }

        }


    }

}



