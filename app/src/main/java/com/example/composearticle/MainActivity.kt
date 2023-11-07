package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
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
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    ComposeCard(
        heading = stringResource(R.string.compose_heading),
        p1 = stringResource(R.string.compose_p1),
        p2 = stringResource(R.string.compose_p2),
        image = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
fun ComposeCard(
    heading: String,
    p1: String,
    p2: String,
    image: Painter,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(
                bottom = 100.dp
            )
    ) {
        Image(
            painter = image,
            contentDescription = null
        )
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ExplainComposePreview() {
    ComposeArticleTheme {
        ComposeArticleApp()
    }
}