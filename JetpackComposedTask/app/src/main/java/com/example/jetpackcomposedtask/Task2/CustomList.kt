package com.example.jetpackcomposedtask.Task2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposedtask.Model.Car
import com.example.jetpackcomposedtask.R


@Composable
fun CustomListScreen(onCarClick: (Car) -> Unit) {
    val cars = listOf(
        // BMW
        Car(R.drawable.bmw_x1,"BMW","X1","₹49,50,000"),
        Car(R.drawable.bmw_x2,"BMW","X2","₹45,00,000"),
        Car(R.drawable.bmw_x3, "BMW", "X3", "₹68,50,000"),
        Car(R.drawable.bmw_x7, "BMW", "X7", "₹1,30,00,000"),
        Car(R.drawable.bmw_xm, "BMW", "XM", "₹2,60,00,000"),

        // Audi
        Car(R.drawable.audi_a4, "Audi", "A4", "₹46,00,000"),
        Car(R.drawable.audi_q3, "Audi", "Q3", "₹44,00,000"),
        Car(R.drawable.audi_q4, "Audi", "Q4", "₹55,00,000"),
        Car(R.drawable.audi_q6, "Audi", "Q6", "₹70,00,000"),
        Car(R.drawable.audi_q7, "Audi", "Q7", "₹88,00,000"),

        // Mahindra
        Car(R.drawable.mahindra_xuv_3xo, "Mahindra", "XUV 3XO", "₹7,49,000"),
        Car(R.drawable.mahindra_xuv_700, "Mahindra", "XUV 700", "₹13,99,000"),
        Car(R.drawable.mahindra_xuv_7xo, "Mahindra", "XUV 7XO", "₹25,00,000"),
        Car(R.drawable.mahindra_xev_9s, "Mahindra", "XEV 9S", "₹35,00,000"),
        Car(R.drawable.mahindra_xev_be6, "Mahindra", "XEV BE6", "₹30,00,000"),

        // Tata
        Car(R.drawable.tata_nexon, "Tata", "Nexon", "₹8,00,000"),
        Car(R.drawable.tata_herrir, "Tata", "Harrier", "₹15,49,000"),
        Car(R.drawable.tata_safari, "Tata", "Safari", "₹16,19,000"),
        Car(R.drawable.tata_paunch, "Tata", "Punch", "₹6,13,000"),
        Car(R.drawable.tata_sierra, "Tata", "Sierra", "₹25,00,000")
    )

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "Popular Cars In India",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF1976D2), // deeper blue
            modifier = Modifier.padding(bottom = 16.dp)
        )
        // Lazy Column for list like Recyclerview in xml
        LazyColumn(contentPadding = PaddingValues(bottom = 16.dp)) {
            items(cars){car ->
                CarItem(car, onClick = { onCarClick(car) })
            }
        }
    }
}

@Composable
fun CarItem(car: Car, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick() }, // Click event added here
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Circle Image filling the whole circle
            Image(
                painter = painterResource(id = car.image),
                contentDescription = "${car.brand} ${car.model}",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop // Crop will fill the whole circle
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = car.brand,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray
                )

                Text(
                    text = car.model,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = car.price,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF388E3C) // Green color for price
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreeviewCustomList(){
    CustomListScreen(onCarClick = {})
}
