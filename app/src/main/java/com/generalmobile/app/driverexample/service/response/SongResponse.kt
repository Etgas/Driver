package com.generalmobile.app.driverexample.service.response

import com.google.gson.annotations.SerializedName

data class SongResponse(
        @field:SerializedName("song")
        val song: String? = null,

        @field:SerializedName("song")
        val id: String? = null
) {
}