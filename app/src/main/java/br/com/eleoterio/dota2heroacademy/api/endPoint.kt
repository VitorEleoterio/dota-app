package br.com.eleoterio.dota2heroacademy.api

import okhttp3.Call
import retrofit2.Response
import retrofit2.http.GET
import java.security.Provider

interface Endpoint {

    @GET("teams/10")
    fun getPosts() : Response<HeroResponse>
}