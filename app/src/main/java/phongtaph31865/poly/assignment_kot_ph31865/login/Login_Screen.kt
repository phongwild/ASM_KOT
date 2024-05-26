package phongtaph31865.poly.assignment_kot_ph31865.login

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import phongtaph31865.poly.assignment_kot_ph31865.R
import phongtaph31865.poly.assignment_kot_ph31865.Routes
import phongtaph31865.poly.assignment_kot_ph31865.navigation.BottomNavbar
//import phongtaph31865.poly.assignment_kot_ph31865.navigation.Container_Bottom_nav
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.MerriweatherFontFamily

//@Preview
@Composable
fun Login_Screen(navController: NavController) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier
                .padding(top = 60.dp, start = 15.dp, end = 20.dp)
                .fillMaxWidth()
                .height(60.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .width(130.dp)
                    .height(1.dp)
                    .background(color = Color("#BDBDBD".toColorInt()))
            ) {}
            Image(
                painter = painterResource(id = R.drawable.ic_chair), contentDescription = "",
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
            )
            Column(
                modifier = Modifier
                    .width(125.dp)
                    .height(1.dp)
                    .background(color = Color("#BDBDBD".toColorInt()))
            ) {}
        }
        Spacer(modifier = Modifier.height(40.dp))
        Column(
            modifier = Modifier.padding(top = 20.dp, start = 30.dp, bottom = 20.dp),
        ) {
            Text(
                text = "Hello !",
                modifier = Modifier,
                color = Color("#909090".toColorInt()),
                fontSize = 30.sp,
                lineHeight = 45.sp,
                fontFamily = MerriweatherFontFamily,
                fontWeight = FontWeight(400)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "WELCOME BACK",
                modifier = Modifier,
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight(700),
                lineHeight = 45.sp,
                fontFamily = MerriweatherFontFamily
            )
        }
        Column(
            modifier = Modifier
                .width(345.dp)
                .height(437.dp)
                .padding(start = 20.dp, top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            input(name = "Email")
            Spacer(modifier = Modifier.height(10.dp))
            input(name = "Password")
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Forgot Password",
                modifier = Modifier,
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                lineHeight = 24.sp,
                color = Color("#303030".toColorInt())
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    navController.navigate(Routes.BottomNav){
                        popUpTo(Routes.Desti)
                    }
                },
                modifier = Modifier
                    .width(285.dp)
                    .height(50.dp)
                    .padding(start = 15.dp, end = 15.dp),
                colors = ButtonDefaults.buttonColors(Color("#242424".toColorInt())),
                shape = CutCornerShape(7)
            ) {
                Text(
                    text = "Log in",
                    fontWeight = FontWeight(500),
                    fontSize = 18.sp,
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {
                    navController.navigate(Routes.Register)
                },
                modifier = Modifier
                    .width(285.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(Color("#ffffff".toColorInt())),
            ) {
                Text(
                    text = "SIGN UP",
                    color = Color("#303030".toColorInt()),
                    fontWeight = FontWeight(500),
                    fontSize = 16.sp,
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun input(name: String) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = { Text(text = name, color = Color("#909090".toColorInt()), fontSize = 14.sp) },
        modifier = Modifier
            .fillMaxWidth()
            .drawBehind { // Custom modifier to draw the bottom border
                val strokeWidth = 2.dp // Adjust as needed
                val color = Color("#E0E0E0".toColorInt()) // Customize the color
                drawLine(
                    color = color,
                    start = Offset(0f, size.height - strokeWidth.toPx() / 2),
                    end = Offset(size.width, size.height - strokeWidth.toPx() / 2),
                    strokeWidth = strokeWidth.toPx()
                )
            }
            .padding(start = 10.dp, top = 15.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
        )
    )
}

@Composable
fun button(color: String, value: String, onClick: () -> Unit) {
    Button(
        onClick = {
            onClick
        },
        modifier = Modifier
            .width(285.dp)
            .height(50.dp)
            .padding(start = 15.dp, end = 15.dp),
        colors = ButtonDefaults.buttonColors(Color(color.toColorInt())),
        shape = CutCornerShape(7)
    ) {
        Text(
            text = value,
            fontWeight = FontWeight(500),
            fontSize = 18.sp,
        )
    }
}