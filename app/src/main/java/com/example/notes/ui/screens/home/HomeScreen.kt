package com.example.notes.ui.screens.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notes.ui.components.ImageText
import com.example.notes.ui.components.ShowImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onAddClick: () -> Unit) {

    Scaffold(

        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF252525),
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),

                title = {
                    Text(
                        text = "Notes",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 30.sp
                    )
                },

                actions = {

                    IconButton(
                        onClick = { },
                        modifier = Modifier.padding(end = 10.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            modifier = Modifier
                                .background(
                                    Color(0xFF3B3B3B),
                                    RoundedCornerShape(12.dp)
                                )
                                .padding(6.dp)
                        )
                    }

                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Lock",
                            modifier = Modifier
                                .background(
                                    Color(0xFF3B3B3B),
                                    RoundedCornerShape(12.dp)
                                )
                                .padding(6.dp)
                        )
                    }
                }
            )
        },

        floatingActionButton = {

            Box(
                modifier = Modifier
                    .shadow(10.dp, RoundedCornerShape(50))
                    .background(Color(0xFF252525), RoundedCornerShape(50))
            ) {

                FloatingActionButton(
                    onClick = onAddClick,
                    containerColor = Color.Transparent,
                    elevation = FloatingActionButtonDefaults.elevation(0.dp),
                    modifier = Modifier.size(70.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        tint = Color.White,
                        contentDescription = "Add Note",
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
        }

    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF252525))
                .padding(paddingValues),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ShowImage()
            ImageText()
        }
    }

}