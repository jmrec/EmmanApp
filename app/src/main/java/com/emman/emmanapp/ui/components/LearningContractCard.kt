package com.emman.emmanapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun LearningContractCard(
    title: String,
    bulletPoints: List<String>,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column {
            Text(
                title,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
            )

            bulletPoints.forEachIndexed { index, point ->
                Text(
                    text = "${index + 1}. $point",
                    modifier = Modifier
                        .padding(
                            horizontal = 16.dp,
                            vertical = 5.dp
                        )
                        .fillMaxWidth()
                )
            }
        }
    }
}