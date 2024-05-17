package com.example.mywishlist.Data

data class Wish(
    val id: Long  = 0L,
    val title: String = "",
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
