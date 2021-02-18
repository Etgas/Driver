package com.generalmobile.app.driverexample.service.response

import com.google.gson.annotations.SerializedName

data class ArtistsResponse(

        @field:SerializedName("artist")
        val artist: String? = null,

        @field:SerializedName("id")
        val id: String? = null
) {
}