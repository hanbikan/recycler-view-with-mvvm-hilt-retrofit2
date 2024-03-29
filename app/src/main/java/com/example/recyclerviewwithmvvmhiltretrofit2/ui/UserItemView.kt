package com.example.recyclerviewwithmvvmhiltretrofit2.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.recyclerviewwithmvvmhiltretrofit2.data.entity.User
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel

@Composable
fun UserItemView(userModel: UserModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(userModel.avatar)
                    .crossfade(true)
                    .build()
            )
            Image(
                painter = painter,
                contentScale = ContentScale.Crop,
                contentDescription = "Picture of a user"
            )
            Text(
                text = userModel.name,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}