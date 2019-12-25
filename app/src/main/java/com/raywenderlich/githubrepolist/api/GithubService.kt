package com.raywenderlich.githubrepolist.api

import com.raywenderlich.githubrepolist.data.RepoResult
import retrofit2.http.GET

interface GithubService {
    @GET("/repositories")
    suspend fun retrieveRepositories(): RepoResult

    @GET("/search/repositories?q=language:kotlin&sort=stars&order=desc") //sample search
    suspend fun searchRepositories(): RepoResult
}