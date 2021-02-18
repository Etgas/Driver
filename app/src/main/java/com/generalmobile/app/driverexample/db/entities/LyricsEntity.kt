package com.generalmobile.app.driverexample.db.entities

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.generalmobile.app.driverexample.service.response.LyricsResponse

@Entity(tableName = "Lyrics")
class LyricsEntity(
        @PrimaryKey(autoGenerate = true)
        var id: Int?,
        var lyrics: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString()) {
    }

    constructor(lyricsResponse: LyricsResponse?) : this(
            lyrics = lyricsResponse?.lyrics,
            id = lyricsResponse?.id

    )

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<LyricsEntity> {
        override fun createFromParcel(parcel: Parcel): LyricsEntity {
            return LyricsEntity(parcel)
        }

        override fun newArray(size: Int): Array<LyricsEntity?> {
            return arrayOfNulls(size)
        }
    }
}