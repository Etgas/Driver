package com.generalmobile.app.driverexample.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\nH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/generalmobile/app/driverexample/di/module/NetModule;", "", "()V", "proviceService", "Lcom/generalmobile/app/driverexample/service/driverApi;", "retrofit", "Lretrofit2/Retrofit$Builder;", "provideGson", "Lcom/google/gson/Gson;", "provideNonCachedOkHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttpClient", "provideRetrofit", "gson", "client", "app_debug"})
@dagger.Module()
public final class NetModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cached")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "non_cached")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideNonCachedOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit.Builder provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cached")
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.generalmobile.app.driverexample.service.driverApi proviceService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofit) {
        return null;
    }
    
    public NetModule() {
        super();
    }
}