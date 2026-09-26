package com.example.week2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


@Composable
fun Soal2() {

    var name by remember {
        mutableStateOf("")
    }

    var destination by remember {
        mutableStateOf("")
    }

    var date by remember {
        mutableStateOf("")
    }

    var notes by remember {
        mutableStateOf("")
    }

    val darkBackground = Color(0xFF11111F)
    val cardBackground = Color(0xFF1D1D30)
    val redAccent = Color(0xFFE53935)
    val goldAccent = Color(0xFFFFC857)
    val whiteText = Color(0xFFF8F8F8)
    val grayText = Color(0xFFB8B8C7)

    val poppinsFont = FontFamily.SansSerif

    Scaffold(
        containerColor = darkBackground,

        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                containerColor = cardBackground,
                contentColor = Color.White
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Trip"
                )
            }
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(darkBackground)
                .padding(innerPadding)
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 24.dp,
                    bottom = 24.dp
                ),
            verticalArrangement = Arrangement.Top
        ) {

            Text(
                text = "Dotonbori Trip",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = whiteText,
                fontFamily = poppinsFont
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Osaka, Japan 🇯🇵",
                fontSize = 16.sp,
                color = goldAccent,
                fontWeight = FontWeight.Medium,
                fontFamily = poppinsFont
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Plan your next adventure in the heart of Osaka.",
                fontSize = 14.sp,
                color = grayText,
                fontFamily = poppinsFont
            )

            Spacer(modifier = Modifier.height(28.dp))

            Image(
                painter = painterResource(id = R.drawable.dotonbori),
                contentDescription = "Dotonbori",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Travel Information",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = whiteText,
                fontFamily = poppinsFont
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = name,
                onValueChange = {
                    name = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Your Name", fontFamily = poppinsFont)
                },
                placeholder = {
                    Text("Enter your name", fontFamily = poppinsFont)
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Name"
                    )
                },
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = cardBackground,
                    unfocusedContainerColor = cardBackground,
                    focusedTextColor = whiteText,
                    unfocusedTextColor = whiteText,
                    focusedLabelColor = goldAccent,
                    unfocusedLabelColor = grayText,
                    focusedIndicatorColor = goldAccent,
                    unfocusedIndicatorColor = grayText,
                    focusedLeadingIconColor = goldAccent,
                    unfocusedLeadingIconColor = grayText,
                    cursorColor = goldAccent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = destination,
                onValueChange = {
                    destination = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Destination", fontFamily = poppinsFont)
                },
                placeholder = {
                    Text("Dotonbori, Osaka", fontFamily = poppinsFont)
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Destination"
                    )
                },
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = cardBackground,
                    unfocusedContainerColor = cardBackground,
                    focusedTextColor = whiteText,
                    unfocusedTextColor = whiteText,
                    focusedLabelColor = goldAccent,
                    unfocusedLabelColor = grayText,
                    focusedIndicatorColor = goldAccent,
                    unfocusedIndicatorColor = grayText,
                    focusedLeadingIconColor = goldAccent,
                    unfocusedLeadingIconColor = grayText,
                    cursorColor = goldAccent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = date,
                onValueChange = {
                    date = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Travel Date", fontFamily = poppinsFont)
                },
                placeholder = {
                    Text("DD / MM / YYYY", fontFamily = poppinsFont)
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.CalendarMonth,
                        contentDescription = "Date"
                    )
                },
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = cardBackground,
                    unfocusedContainerColor = cardBackground,
                    focusedTextColor = whiteText,
                    unfocusedTextColor = whiteText,
                    focusedLabelColor = goldAccent,
                    unfocusedLabelColor = grayText,
                    focusedIndicatorColor = goldAccent,
                    unfocusedIndicatorColor = grayText,
                    focusedLeadingIconColor = goldAccent,
                    unfocusedLeadingIconColor = grayText,
                    cursorColor = goldAccent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = notes,
                onValueChange = {
                    notes = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp),
                label = {
                    Text("Travel Notes", fontFamily = poppinsFont)
                },
                placeholder = {
                    Text("Takoyaki, neon lights, Dotonbori River...", fontFamily = poppinsFont)
                },
                shape = RoundedCornerShape(16.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = cardBackground,
                    unfocusedContainerColor = cardBackground,
                    focusedTextColor = whiteText,
                    unfocusedTextColor = whiteText,
                    focusedLabelColor = goldAccent,
                    unfocusedLabelColor = grayText,
                    focusedIndicatorColor = goldAccent,
                    unfocusedIndicatorColor = grayText,
                    focusedLeadingIconColor = goldAccent,
                    unfocusedLeadingIconColor = grayText,
                    cursorColor = goldAccent
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "道頓堀 • DOTONBORI",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = redAccent,
                fontFamily = poppinsFont,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}
