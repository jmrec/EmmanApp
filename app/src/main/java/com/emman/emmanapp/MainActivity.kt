package com.emman.emmanapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.emman.emmanapp.ui.components.LearningContractCard
import com.emman.emmanapp.ui.theme.EmmanAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmmanAppTheme {
                val learningContractPoints = mapOf(
                    stringResource(R.string.expectations_title) to stringArrayResource(R.array.expectations).toList(),
                    stringResource(R.string.contributions_title) to stringArrayResource(R.array.contributions).toList(),
                    stringResource(R.string.motivations_title) to stringArrayResource(R.array.motivations).toList(),
                    stringResource(R.string.hindrances_title) to stringArrayResource(R.array.hindrances).toList(),
                    stringResource(R.string.members_title) to stringArrayResource(R.array.members).toList()
                )

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        learningContractPoints.forEach { (title, points) ->
                            LearningContractCard(
                                title = title,
                                bulletPoints = points,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                }
            }
        }
    }
}