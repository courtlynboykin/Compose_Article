package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeImage(
                        heading = stringResource(R.string.compose_heading),
                        p1 = stringResource(R.string.compose_p1),
                        p2 = stringResource(R.string.compose_p2)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeText(heading: String, p1: String, p2: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(
                top = 136.dp,
                bottom = 100.dp
            )
    ) {
        Text(
            text = heading,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = p1,
            fontSize = 12.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = p2,
            fontSize = 12.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun ComposeImage(heading: String, p1: String, p2: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null
        )
        ComposeText(
            heading = heading,
            p1 = p1,
            p2 = p2,
            modifier = Modifier
                //.padding(5.dp) come back, maybe diff padding for top and bottom
                .padding(
                    top = 136.dp,
                    bottom = 100.dp
                )
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ExplainComposePreview() {
    ComposeArticleTheme {
        ComposeImage(
            stringResource(R.string.compose_heading),
            stringResource(R.string.compose_p1),
            stringResource(R.string.compose_p2)
        )
    }
}