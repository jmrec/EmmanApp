package com.emman.emmanapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.emman.emmanapp.ui.theme.BorderDarkGreen
import com.emman.emmanapp.ui.theme.BorderLightGreen

@Composable
fun LearningContractCard(
    title: String,
    bulletPoints: List<String>,
    modifier: Modifier = Modifier,
    cardColor: Color = MaterialTheme.colorScheme.surfaceVariant
) {
    val borderColor = if (isSystemInDarkTheme()) {
        BorderDarkGreen
    } else {
        BorderLightGreen
    }

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, borderColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = cardColor
        )
    ) {
        Column {
            Text(
                title,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                fontWeight = FontWeight.Bold
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