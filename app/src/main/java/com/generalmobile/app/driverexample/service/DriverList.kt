package com.generalmobile.app.driverexample.service

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class DriverList(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("point")
	val point: Int? = null
):Parcelable {
	constructor(parcel: Parcel) : this(
			parcel.readString(),
			parcel.readValue(Int::class.java.classLoader) as? Int,
			parcel.readValue(Int::class.java.classLoader) as? Int) {
	}

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeString(name)
		parcel.writeValue(id)
		parcel.writeValue(point)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<DriverList> {
		override fun createFromParcel(parcel: Parcel): DriverList {
			return DriverList(parcel)
		}

		override fun newArray(size: Int): Array<DriverList?> {
			return arrayOfNulls(size)
		}
	}
}