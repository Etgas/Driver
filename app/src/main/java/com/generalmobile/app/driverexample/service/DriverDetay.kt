package com.generalmobile.app.driverexample.service

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class DriverDetay(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("team")
	val team: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
):Parcelable {
	constructor(parcel: Parcel) : this(
			parcel.readString(),
			parcel.readValue(Int::class.java.classLoader) as? Int,
			parcel.readString(),
			parcel.readValue(Int::class.java.classLoader) as? Int) {
	}

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeString(image)
		parcel.writeValue(id)
		parcel.writeString(team)
		parcel.writeValue(age)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<DriverDetay> {
		override fun createFromParcel(parcel: Parcel): DriverDetay {
			return DriverDetay(parcel)
		}

		override fun newArray(size: Int): Array<DriverDetay?> {
			return arrayOfNulls(size)
		}
	}
}