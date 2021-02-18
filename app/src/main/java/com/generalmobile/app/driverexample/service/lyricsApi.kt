package com.generalmobile.app.driverexample.service

import com.generalmobile.app.driverexample.service.response.ArtistsResponse
import com.generalmobile.app.driverexample.service.response.LyricsResponse
import com.generalmobile.app.driverexample.service.response.SongResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface lyricsApi {

    @GET("lyrics")
    fun getLyrics(): io.reactivex.Observable<List<LyricsResponse>>

    @GET("artists")
    fun getArtists(@Query("artist") id: String): io.reactivex.Observable<List<ArtistsResponse>>


    @GET("songs")
    fun getSongs(@Query("song") id: String): io.reactivex.Observable<List<SongResponse>>
}