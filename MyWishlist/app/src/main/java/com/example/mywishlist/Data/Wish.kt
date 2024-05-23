package com.example.mywishlist.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long  = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWishList{
    val wishList = listOf(
        Wish(title = "Google watch", description = "An android watch"),
        Wish(title = "Google watch2", description = "An android watch2"),
        Wish(title = "Google watch3", description = "An android watch4"),
        Wish(title = "Google watch4v 4", description = "An android watchv4v4 4 4"),
        Wish(title = "Google watch  4", description = "An android watch 4 4     " ),
    )
}
