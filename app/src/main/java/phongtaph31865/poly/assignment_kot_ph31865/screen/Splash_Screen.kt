package phongtaph31865.poly.assignment_kot_ph31865.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import phongtaph31865.poly.assignment_kot_ph31865.R
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.GelasioFont

@Preview
@Composable
fun Splash_Screen(){
    Box{
        Image(painter = painterResource(id = R.drawable.bg_boarding), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize())
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "MAKE YOUR", fontFamily = GelasioFont, fontWeight = FontWeight(600), fontSize = 24.sp, color = Color("#606060".toColorInt()))
        }
    }
}