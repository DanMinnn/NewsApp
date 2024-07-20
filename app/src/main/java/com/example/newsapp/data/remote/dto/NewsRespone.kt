package com.example.newsapp.data.remote.dto

import com.example.newsapp.domain.model.Article

data class NewsRespone(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)