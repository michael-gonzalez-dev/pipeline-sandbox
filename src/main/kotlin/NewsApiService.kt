package com.mediasage.service

class NewsApiService {

    companion object {
        private const val EXCLUDED_CATEGORIES = "politics,opinion,sponsored"
    }

    private fun buildExcludedCategories(): String = EXCLUDED_CATEGORIES

    fun fetchArticles(query: String): List<String> {
        val parameters = mutableMapOf<String, String>()
        parameters["q"] = query
        parameters["language"] = "en"
        parameters["exclude_categories"] = buildExcludedCategories()
        return emptyList()
    }
}
