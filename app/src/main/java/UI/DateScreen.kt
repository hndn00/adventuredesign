package UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun DateScreen(onBackClick: () -> Unit) {
    val currentDate = remember {
        SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA).format(Date())
    }
    val currentTime = remember {
        SimpleDateFormat("HH:mm", Locale.KOREA).format(Date())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB085C7))
            .padding(30.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Button(
            onClick = onBackClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White.copy(alpha = 0.2f)
            ),
            modifier = Modifier.align(Alignment.Start)
        ) {
            Text("← 뒤로", color = Color.White)
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 50.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Text(
                    text = "오늘 날짜",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Light
                )

                Text(
                    text = currentDate,
                    fontSize = 28.sp,
                    color = Color(0xFF333333),
                    fontWeight = FontWeight.Medium
                )

                Divider(
                    color = Color.Gray.copy(alpha = 0.3f),
                    modifier = Modifier.padding(vertical = 10.dp)
                )

                Text(
                    text = "현재 시간",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Light
                )

                Text(
                    text = currentTime,
                    fontSize = 36.sp,
                    color = Color(0xFFB085C7),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White.copy(alpha = 0.9f)
            ),
            shape = RoundedCornerShape(15.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "📅 Today's Info",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF333333)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "좋은 하루 보내세요!",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}