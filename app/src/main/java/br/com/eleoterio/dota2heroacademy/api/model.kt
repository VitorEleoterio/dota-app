package br.com.eleoterio.dota2heroacademy.api

import com.google.gson.annotations.SerializedName

data class HeroResponse(
    @SerializedName("name")
    var heroId : String,
    @SerializedName("tag")
    var id : String
)