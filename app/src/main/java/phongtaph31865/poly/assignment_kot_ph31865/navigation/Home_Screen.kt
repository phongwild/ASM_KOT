package phongtaph31865.poly.assignment_kot_ph31865.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import phongtaph31865.poly.assignment_kot_ph31865.R
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.GelasioFont
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.backGround
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.defaultIconColor
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.selectedIconColor
@Preview
@Composable
fun Home_Screen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backGround),
        verticalArrangement = Arrangement.Top
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
        ){
            IconButton(onClick = { }, modifier = Modifier.weight(1f)) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_search) , contentDescription = "")
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(3f)
            ){
                Text(text = "Make home",
                    color = defaultIconColor,
                    fontSize = 18.sp, fontWeight = FontWeight(400), fontFamily = GelasioFont, lineHeight = 25.sp
                )
                Text(text = "BEAUTIFUL",
                    color = Color.Black,
                    fontSize = 18.sp, fontWeight = FontWeight(700), fontFamily = GelasioFont, lineHeight = 25.sp
                )
            }
            IconButton(onClick = { }, modifier = Modifier.weight(1f)) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_cart) , contentDescription = "")
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            CateHome(title = "Popular", img = R.drawable.star)
            CateHome(title = "Chair", img = R.drawable.chair)
            CateHome(title = "Table", img = R.drawable.table)
            CateHome(title = "Armchair", img = R.drawable.armchair)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Row {
                ProductItem(img = R.drawable.black_simple_lamp, title = "Black Simple Lamp", price = "12.00")
                ProductItem(img = R.drawable.minimal_stand, title = "Minimal Stand", price = "25.00")
            }
            Row {
                ProductItem(img = R.drawable.black_simple_lamp, title = "Black Simple Lamp", price = "12.00")
                ProductItem(img = R.drawable.minimal_stand, title = "Minimal Stand", price = "25.00")
            }
            Row {
                ProductItem(img = R.drawable.black_simple_lamp, title = "Black Simple Lamp", price = "12.00")
                ProductItem(img = R.drawable.minimal_stand, title = "Minimal Stand", price = "25.00")
            }
        }
//        @Composable
//        fun ProductGrid(products: List<Product>) {
//            LazyColumn(
//                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
//                verticalArrangement = Arrangement.spacedBy(16.dp)
//            ) {
//                items(products.chunked(2)) { rowItems ->
//                    Row(
//                        horizontalArrangement = Arrangement.spacedBy(16.dp),
//                        modifier = Modifier.fillMaxWidth()
//                    ) {
//                        for (item in rowItems) {
//                            ProductItem(product = item, modifier = Modifier.weight(1f))
//                        }
//                    }
//                }
//            }
//        }
    }
}
@Composable
fun CateHome(title: String, img: Int,){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        Column(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .clip(CutCornerShape(12.dp))
                .background(Color("#f5f5f5".toColorInt())),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = img), contentDescription = null, modifier = Modifier
                .width(24.dp)
                .height(24.dp))
        }
        Text(text = title, fontSize = 14.sp, fontWeight = FontWeight(600), lineHeight = 19.sp, color = Color("#999999".toColorInt()))

    }
}
data class Product(val name: String, val price: Double, val imageRes: Int)

val sampleProducts = listOf(
    Product("Black Simple Lamp", 12.00, R.drawable.black_simple_lamp),
    Product("Minimal Stand", 25.00, R.drawable.minimal_stand),
    Product("Coffee Chair", 20.00, R.drawable.coffee_chair),
    Product("Simple Desk", 50.00, R.drawable.simple_desk)
)
@Composable
fun ProductItem( modifier: Modifier = Modifier, img: Int, title: String, price: String) {
    Column(
        modifier = modifier
            .clickable {

            }
            .padding(8.dp)
            .width(160.dp)
            .height(255.dp)
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = price,
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.fillMaxWidth()
        )
    }
}
