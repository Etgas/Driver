package com.generalmobile.app.driverexample.db.entities

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DriverEntity(
        var name: String,
        var point: Int,
        @PrimaryKey(autoGenerate = true)
        var id: Int

) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(point)
        parcel.writeInt(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DriverEntity> {
        override fun createFromParcel(parcel: Parcel): DriverEntity {
            return DriverEntity(parcel)
        }

        override fun newArray(size: Int): Array<DriverEntity?> {
            return arrayOfNulls(size)
        }
    }
}