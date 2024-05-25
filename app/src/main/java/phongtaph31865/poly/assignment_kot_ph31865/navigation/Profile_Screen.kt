package phongtaph31865.poly.assignment_kot_ph31865.navigation

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import phongtaph31865.poly.assignment_kot_ph31865.R
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.MerriweatherFontFamily
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.backGround
import phongtaph31865.poly.assignment_kot_ph31865.ui.theme.selectedIconColor
@Preview
@Composable
fun Profile_Screen(){
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
                Text(text = "Profile",
                    color = Color.Black,
                    fontSize = 16.sp, fontWeight = FontWeight(700), fontFamily = MerriweatherFontFamily, lineHeight = 20.sp
                )
            }
            IconButton(onClick = { }, modifier = Modifier.weight(1f)) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_logout) , contentDescription = "")
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 20.dp, start = 20.dp, end = 20.dp)
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.img_user),
                contentDescription = null,
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .clip(CircleShape)
                    .padding())
            Column(
                modifier = Modifier.padding(start = 20.dp),
                horizontalAlignment = Alignment.Start
            ){
                Text(text = "Trần Anh Phong", fontWeight = FontWeight(700), fontSize = 20.sp, lineHeight = 27.sp, color = Color("#303030".toColorInt()))
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "phongtaph31865@fpt.poly.edu.vn", fontWeight = FontWeight(400), fontSize = 14.sp, lineHeight = 15.sp, color = Color("#808080".toColorInt()))
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        button_profile(title = "My order", notifi = "Already have 10 order",
            onClick = { /*TODO*/ }
        )
        button_profile(title = "Shipping Addresses", notifi = "03 Addresses",
            onClick = { /*TODO*/ }
        )
        button_profile(title = "Payment Method", notifi = "You have 2 cards",
            onClick = { /*TODO*/ }
        )
        button_profile(title = "My reviews", notifi = "Reviews for 5 items",
            onClick = { /*TODO*/ }
        )
        button_profile(title = "Setting", notifi = "Notification, Password, FAQ, Contact",
            onClick = { /*TODO*/ }
        )
    }
}

@Composable
fun button_profile(onClick:()->Unit, title:String, notifi: String){
    Button(onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(start = 20.dp, end = 20.dp, bottom = 15.dp)
            .shadow(
                elevation = 2.dp,
                shape = CutCornerShape(0)
            ),
        colors = ButtonDefaults.buttonColors(Color.White),
        shape = CutCornerShape(0),) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = title, fontWeight = FontWeight(700), fontSize = 18.sp, lineHeight = 24.sp, color = Color("#242424".toColorInt()))
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = notifi, fontWeight = FontWeight(400), fontSize = 12.sp, lineHeight = 15.sp, color = Color("#808080".toColorInt()))
            }
            //Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_next_arrow), contentDescription = null)
            Image(painter = painterResource(id = R.drawable.ic_next), contentDescription = null, modifier = Modifier.width(16.dp))
        }
    }
}