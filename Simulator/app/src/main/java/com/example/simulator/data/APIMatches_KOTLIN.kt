package com.example.simulator.data

import com.example.simulator.domain.Match
import retrofit2.Call
import retrofit2.http.GET

interface APIMatches_KOTLIN {
    @GET("matches.json")
    fun getMatches(): Call<List<Match?>?>?
}