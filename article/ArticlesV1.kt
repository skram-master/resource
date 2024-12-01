package com.skram_master.resource.article

import io.ktor.resources.Resource
import kotlinx.serialization.Serializable

@Serializable
@Resource("api/v1/articles")
class ArticlesV1 {

    @Serializable
    @Resource("/new")
    class New(val parent: ArticlesV1 = ArticlesV1())

    companion object {
        val tags = listOf("Articles")
    }
}
