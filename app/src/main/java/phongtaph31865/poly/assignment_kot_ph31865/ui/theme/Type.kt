package phongtaph31865.poly.assignment_kot_ph31865.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import phongtaph31865.poly.assignment_kot_ph31865.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
val MerriweatherFontFamily = FontFamily(
    Font(R.font.merriweather_bold, FontWeight.Bold),
    Font(R.font.merriweather_regular, FontWeight.Normal),
    Font(R.font.merriweather_italic, FontWeight.Light),
    Font(R.font.merriweather_black, FontWeight.Black),
    Font(R.font.merriweather_bolditalic, FontWeight.SemiBold),
    Font(R.font.merriweather_lightitalic, FontWeight.Light),
    Font(R.font.merriweather_blackitalic, FontWeight.Black),
)
val NunitoSans = FontFamily(
    Font(R.font.nunitosans)
)