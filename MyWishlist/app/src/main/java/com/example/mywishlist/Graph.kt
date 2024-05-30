package com.example.mywishlist

import android.content.Context
import androidx.room.Room
import com.example.mywishlist.Data.WishDatabase
import com.example.mywishlist.Data.WishRepository

///In Kotlin object declares a singleton
object Graph {
    lateinit var database : WishDatabase

    val wishRepository by lazy {
        WishRepository(database.wishDao())
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}