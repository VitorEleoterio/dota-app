package br.com.eleoterio.dota2heroacademy.api

import com.google.gson.annotations.SerializedName

data class Get(
    @SerializedName("userId")
    var heroId : Int,
    @SerializedName("id")
    var id : Int,
    @SerializedName("title")
    var heroName : String
)