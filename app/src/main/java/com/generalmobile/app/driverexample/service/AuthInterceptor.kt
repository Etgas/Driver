package com.generalmobile.app.driverexample.service

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()

        val request = chain.request()

        var modifiedRequest = request

        modifiedRequest =
                request.newBuilder()
                        .header("X-Riot-Token", "BRGAPI-ba767c2d-0b4c-41fe-8333-663b71d561e5")
                        .build()


        return chain.proceed(modifiedRequest)
    }
}
