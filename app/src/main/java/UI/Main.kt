package UI
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyAppScreen() {
    var selectedButton by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFFAF9F9)),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "HOW ARE YOU \nTODAY?",
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xFF333333),
                textAlign = TextAlign.Start,
                lineHeight = 40.sp,
                modifier = Modifier.padding(start = 30.dp)
            )
        }

        Column {
            AppButton(
                text = "DATE",
                backgroundColor = Color(0xFFB085C7),
                onClick = {
                    selectedButton = "DATE"
                }
            )

            AppButton(
                text = "MESSAGE",
                backgroundColor = Color(0xFF7C6B93),
                onClick = {
                    selectedButton = "MESSAGE"
                }
            )

            AppButton(
                text = "WEATHER",
                backgroundColor = Color(0xFF5A9BF5),
                onClick = {
                    selectedButton = "weather"
                }
            )
        }
    }

    if (selectedButton.isNotEmpty()) {
        LaunchedEffect(selectedButton) {
            println("Selected: $selectedButton")
        }
    }
}

@Composable
fun AppButton(
    text: String,
    backgroundColor: Color,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(backgroundColor)
            .clickable { onClick() },
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
            color = Color.White,
            modifier = Modifier.padding(start = 30.dp)
        )
    }
}