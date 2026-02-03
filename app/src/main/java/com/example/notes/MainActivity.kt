package com.example.notes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notes.navigation.AppNavigation
import com.example.notes.ui.theme.NotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            NotesTheme {
                AppNavigation()
            }
        }
    }
}









//package com.example.notes
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Add
//import androidx.compose.material.icons.filled.Lock
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.FloatingActionButton
//import androidx.compose.material3.FloatingActionButtonDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.TopAppBarDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.shadow
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.notes.ui.theme.NotesTheme
//
//class MainActivity : ComponentActivity() {
//    @SuppressLint("ResourceAsColor")
//    @OptIn(ExperimentalMaterial3Api::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            NotesTheme {
//
//                Scaffold(
//                    modifier = Modifier.background(Color(0xFF252525)),
//                    topBar = {
//                        TopAppBar(
//                            colors = TopAppBarDefaults.topAppBarColors(
//                                containerColor = Color(0xFF252525),
//                                titleContentColor = Color.White,
//                                actionIconContentColor = Color.White
//                            ),
//
//                            title = {
//                                Text(
//                                    text = "Notes",
//                                    fontWeight = FontWeight.SemiBold,
//                                    style = TextStyle(
//                                        fontSize = 30.sp,
//                                    )
//                                )
//                            },
//
//                            actions = {
//                                IconButton(
//                                    onClick = { },
//                                    modifier = Modifier
//                                        .padding(end = 10.dp)
//                                        .height(50.dp)
//                                        .width(50.dp)
//                                ) {
//                                    Icon(
//                                        imageVector = Icons.Default.Search,
//                                        contentDescription = "Search",
//                                        modifier = Modifier
//                                            .background(
//                                                Color(0xFF3B3B3B),
//                                                RoundedCornerShape(12.dp)
//                                            )
//                                            .padding(6.dp)
//                                    )
//                                }
//
//                                IconButton(
//                                    onClick = { },
//                                    modifier = Modifier
//                                        .padding(end = 8.dp)
//                                        .height(50.dp)
//                                        .width(50.dp)
//                                ) {
//                                    Icon(
//                                        imageVector = Icons.Default.Lock,
//                                        contentDescription = "Lock",
//                                        modifier = Modifier
//                                            .background(
//                                                Color(0xFF3B3B3B),
//                                                RoundedCornerShape(12.dp)
//                                            )
//                                            .padding(6.dp)
//                                    )
//                                }
//                            }
//                        )
//                    },
//
//                    floatingActionButton = {
//
//                        Box(
//                            modifier = Modifier
//                                .shadow(10.dp, RoundedCornerShape(50))
//                                .border(2.dp, Color.Black, RoundedCornerShape(50))
//                                .background(Color(0xFF252525), RoundedCornerShape(50))
//                        ) {
//
//                            FloatingActionButton(
//                                onClick = {},
//                                containerColor = Color.Transparent,
//                                elevation = FloatingActionButtonDefaults.elevation(0.dp),
//                                modifier = Modifier.size(70.dp)
//                            ) {
//                                Icon(
//                                    imageVector = Icons.Default.Add,
//                                    tint = Color.White,
//                                    contentDescription = "Add Note",
//                                    modifier = Modifier.size(50.dp)
//                                )
//                            }
//                        }
//                    }
//
//                ) { paddingValues ->
//
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color(0xFF252525)),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .padding(paddingValues)
//                                .height(300.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            ShowImage()
//                            ImageText()
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun ShowImage() {
//    Image(
//        painter = painterResource(id = R.drawable.ic_note),
//        modifier = Modifier
//            .height(264.dp),
//        contentDescription = "Note Image",
//        contentScale = ContentScale.Fit,
//    )
//}
//
//@Composable
//fun ImageText() {
//    Text(
//        text = "Create Your First Note!",
//        color = Color.White,
//    )
//}
//@Composable
//fun CreateNoteScreen(onBack: () -> Unit) {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text("Create New Page")
//
//        Button(onClick = onBack) {
//            Text("Go Back")
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ShowImage()
//    ImageText()
//}
//
//@Composable
//fun AppNavigation() {
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = "home"
//    ) {
//        composable("home") {
////            HomeScreen(
////                onAddC
////            )
//        }
//    }
//}
