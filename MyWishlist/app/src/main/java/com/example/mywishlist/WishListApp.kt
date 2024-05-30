package com.example.mywishlist

import android.app.Application

///Application class is useful for initializing global state that needs to be available throughout the app.
///This class is created before any other class when the process of application is created.
///To ensure the project is aware of the Application class, it must be registered within the
///AndroidManifest.xml file using the android:name attribute.
class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}