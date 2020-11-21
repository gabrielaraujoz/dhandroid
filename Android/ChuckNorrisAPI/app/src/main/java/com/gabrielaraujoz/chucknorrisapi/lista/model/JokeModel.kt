package com.gabrielaraujoz.chucknorrisapi.lista.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class JokeModel (
    val icon_url : String,
    @SerializedName("value")
    val joke: String
)