package br.com.eleoterio.dota2heroacademy.api

import okhttp3.Call
import retrofit2.http.GET

interface Endpoint {

    @GET("heroStats")
    fun getPosts() : List<Get>
}