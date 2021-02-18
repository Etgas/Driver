package com.generalmobile.app.driverexample.service.response

import com.google.gson.annotations.SerializedName

data class LyricsResponse(
        @field:SerializedName("song")
        val lyrics: String? = null
) {
}