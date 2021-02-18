package com.generalmobile.app.driverexample.model

import com.google.gson.annotations.SerializedName

data class DriverModel(
        @SerializedName("drivers")
        var list: List<DriversModelList>
)

data class DriversModelList(
        @SerializedName("name")
        var name: String,
        @SerializedName("id")
        var id: Int,
        @SerializedName("age")
        var age: Int
)