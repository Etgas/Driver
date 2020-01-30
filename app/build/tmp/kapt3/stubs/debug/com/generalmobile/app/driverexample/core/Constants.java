package com.generalmobile.app.driverexample.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/generalmobile/app/driverexample/core/Constants;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "loadAge", "", "view", "Landroid/widget/TextView;", "age", "loadImage", "Landroid/widget/ImageView;", "url", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "http://my-json-server.typicode.com/oguzayan/kuka/";
    public static final com.generalmobile.app.driverexample.core.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:loadImage"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:loadAge"})
    public static final void loadAge(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String age) {
    }
    
    private Constants() {
        super();
    }
}