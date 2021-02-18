package com.generalmobile.app.driverexample.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.generalmobile.app.driverexample.db.entities.LyricsEntity

@Dao
interface LyricDao {

    @Query("SELECT * FROM Lyrics where id =:id")
    fun getLyricsId(id: Int): LyricsEntity

    @Query("SELECT * FROM Lyrics where lyrics = :lyrics")
    fun getLyrics(lyrics: String): LyricsEntity

    @Delete
    fun delete(lyricsEntity: LyricsEntity)
}