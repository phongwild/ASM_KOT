package phongtaph31865.poly.assignment_kot_ph31865.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import phongtaph31865.poly.assignment_kot_ph31865.R
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.GelasioFont
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.MerriweatherFontFamily
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.backGround
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.defaultIconColor
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.selectedIconColor

@Preview
@Composable
fun Favorite_Screen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backGround),
        verticalArrangement = Arrangement.Top
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            IconButton(onClick = { }, modifier = Modifier.weight(1f)) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_search) , contentDescription = "")
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(3f)
            ){
                Text(text = "Favorites",
                    color = Color.Black,
                    fontSize = 16.sp, fontWeight = FontWeight(700), fontFamily = MerriweatherFontFamily, lineHeight = 20.sp
                )
            }
            IconButton(onClick = { }, modifier = Modifier.weight(1f)) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_cart) , contentDescription = "")
            }
        }
    }
}