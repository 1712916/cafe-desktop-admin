package presentation.product

import androidx.compose.desktop.ui.tooling.preview.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.*

@Preview
@Composable
fun CreateProductForm() {
    //add name
    //add description
    //add image
    //add category
    //add recipe

    var nameTFV by remember { mutableStateOf(TextFieldValue("")) }
    var descriptionTFV by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .padding(16.dp, 16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Text(
            text = "Add Product",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h5
        )

        Spacer(modifier = Modifier.padding(8.dp))

        Text(
            text = "Name",
            style = MaterialTheme.typography.body2
        )

        TextField(
            value = nameTFV, onValueChange = {
                nameTFV = it
            })

        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Description",
            style = MaterialTheme.typography.body2
        )
        TextField(value = descriptionTFV, onValueChange = {
            descriptionTFV = it
        })
        DragImagesView()

        Button(
            onClick = {

            }
        ) {
            Text("Save")
        }
    }
}

@Composable
fun DragImagesView() {
    //create drag images view holder

    //show list image
}
