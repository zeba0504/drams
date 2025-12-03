package com.example.andromonth

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.andromonth.model.Day

@Composable
fun DayScreenList(days: List<Day>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {}
}