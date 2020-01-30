package com.generalmobile.app.driverexample.core

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object Constants {

    val BASE_URL = "http://my-json-server.typicode.com/oguzayan/kuka/"

    @JvmStatic
    @BindingAdapter("app:loadImage")
    fun loadImage(view:ImageView,url:String?){
        if (url == null || url.isEmpty()){
return
        }
        Picasso.get().load(url).into(view)
    }
    @JvmStatic
    @BindingAdapter("app:loadAge")
    fun loadAge(view: TextView, age : String?){

        age?.let {
            view.text = age
        }
    }
}