package com.generalmobile.app.driverexample.service

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class DriverListResponse(

	@field:SerializedName("items")
	val items: List<DriverList?>? = null
):Parcelable {
	constructor(parcel: Parcel) : this(parcel.createTypedArrayList(DriverList)) {
	}

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeTypedList(items)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<DriverListResponse> {
		override fun createFromParcel(parcel: Parcel): DriverListResponse {
			return DriverListResponse(parcel)
		}

		override fun newArray(size: Int): Array<DriverListResponse?> {
			return arrayOfNulls(size)
		}
	}
}