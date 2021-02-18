package com.generalmobile.app.driverexample.service

import com.generalmobile.app.driverexample.service.response.*
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface riotApi {

    @GET("lol/summoner/v4/summoners/by-name")
    fun getSummoner(@Query("summoner") name: String): Observable<SummonerResponse>

    @GET("lol/match/v4/matchlists/by-account/{encryptedAccountId}")
    fun getMatches(@Query("matches") accountId: String): Observable<List<MatchesResponse>>

    @GET("lol/league/v4/challengerleagues/by-queue/{queue}")
    fun getChallengers(@Query("challengers") queue: String): Observable<List<ChallengerResponse>>

    @GET("lor/status/v1/platform-data")
    fun getLoRDatas(): Observable<LoRResponse>

    @GET("tft/league/v1/entries/{tier}/{division}")
    fun getTftLeague(@Query("tier") tier: String, @Query("divison") division: String): Observable<List<TftLeagueResponse>>

    @GET("lol/league/v4/entries/{queue}/{tier}/{division}")
    fun getLoLLeague(@Query("queue") queue: String, @Query("tier") tier: String, @Query("divison") division: String): Observable<List<LoLLeagueResponse>>

    @GET("lol/league/v4/grandmasterleagues/by-queue/{queue}")
    fun getLoLGrandMastersLeague(@Query("queue") queue: String): Observable<List<LoLGrandMastersResponse>>

    @GET("lol/league/v4/masterleagues/by-queue/{queue}")
    fun getLoLMastersLeague(@Query("queue") queue: String): Observable<List<LoLMastersResponse>>


}


