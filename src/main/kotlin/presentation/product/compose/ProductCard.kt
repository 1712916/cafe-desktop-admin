package presentation.product.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.entity.ProductEntity
import data.mapping.*

class ProductModelToProductView : Mapping<ProductEntity, ListingProductViewData> {
    override fun mapping(source: ProductEntity): ListingProductViewData {
        return ListingProductViewData(source.name ?: "", source.description ?: "", source.images?.first() ?: "")
    }
}

class ListingProductViewData(private val name: String, private val description: String, private val image: String) :
    ProductViewData {
    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun getImage(): String {
        return image
    }

}

interface ProductViewData {
    fun getName(): String
    fun getDescription(): String
    fun getImage(): String
}

@Composable
fun ProductCard(product: ProductViewData, onTap: () -> Unit) {
    Column(modifier = Modifier.wrapContentSize(unbounded = true)) {
        Box {
            Text(product.getImage())
        }
        Text(product.getName())
        Text(product.getDescription())
    }
}
