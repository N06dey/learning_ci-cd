package com.example.basics_ci.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.basics_ci.ui.viewModels.HomePageViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(modifier: Modifier, viewModel: HomePageViewModel) {

    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp)) {

        val ans by viewModel.ans.collectAsStateWithLifecycle()

        Scaffold(topBar = { TopAppBar(title = { Text("Counter") }) }) { pad ->
            Column(Modifier
                .padding(pad)
                .padding(16.dp)) {
                Text("Count: $ans", style = MaterialTheme.typography.headlineSmall)
                Row {
                    Button(onClick = viewModel::inc) { Text("+") }
                    Spacer(Modifier.width(12.dp))
                    OutlinedButton(onClick = viewModel::reset) { Text("Reset") }
                }
            }
        }

//        Box(modifier = Modifier
//            .fillMaxWidth()
//            .padding(40.dp)
//        ){
//            Text(text = "Counter: $ans"
//                ,modifier = Modifier.align(Alignment.Center)
//                , fontSize = 20.sp
//            )
//        }
//
//
//        Row(modifier = Modifier
//            .padding(16.dp)
//            .padding(bottom = 40.dp)
//            .align(Alignment.CenterHorizontally)
//        ) {
//            Button(onClick = {
//                viewModel.inc()
//            }, modifier = Modifier.wrapContentWidth()) {
//                Text("Increment")
//            }
//
//            Spacer(modifier = Modifier.padding(16.dp))
//
//            Button(onClick = {
//                viewModel.reset()
//            }, modifier = Modifier.wrapContentWidth()) {
//                Text("Reset")
//            }
//        }
    }
}

@Composable
fun HomePage(modifier: Modifier) {
    val viewModel: HomePageViewModel = hiltViewModel()
    HomePage(modifier = modifier, viewModel = viewModel)
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview(){
    HomePage(modifier = Modifier.fillMaxSize())
}