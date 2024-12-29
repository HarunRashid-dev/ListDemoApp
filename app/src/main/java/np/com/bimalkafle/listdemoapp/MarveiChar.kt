package np.com.bimalkafle.listdemoapp

data class MarvelChar(
    var chatName : String,
    var name : String,
    var imageRes : Int,
)


fun getAllMarvelChars() : List<MarvelChar>{
    return listOf<MarvelChar>(
        MarvelChar("Thor", name = "Chris Hemsworth",R.drawable.thor),
        MarvelChar("Iron Man", name = "Robert Downey Jr", R.drawable.iron_man),
        MarvelChar("Hulk", name = "Mark Ruffalo", R.drawable.hulk),
        MarvelChar("Wolverine", name = "James Howlett", R.drawable.wolverine),
        MarvelChar("spider-man", name = "Andrew Garfield", R.drawable.spider_man),
        MarvelChar("Thor", name = "Chris Hemsworth",R.drawable.thor),
        MarvelChar("Iron Man", name = "Robert Downey Jr", R.drawable.iron_man),
        MarvelChar("Hulk", name = "Mark Ruffalo", R.drawable.hulk),
        MarvelChar("Wolverine", name = "James Howlett", R.drawable.wolverine),
        MarvelChar("spider-man", name = "Andrew Garfield", R.drawable.spider_man),
        MarvelChar("Thor", name = "Chris Hemsworth",R.drawable.thor),
        MarvelChar("Iron Man", name = "Robert Downey Jr", R.drawable.iron_man),
        MarvelChar("Hulk", name = "Mark Ruffalo", R.drawable.hulk),
        MarvelChar("Wolverine", name = "James Howlett", R.drawable.wolverine),
        MarvelChar("spider-man", name = "Andrew Garfield", R.drawable.spider_man),
        MarvelChar("Thor", name = "Chris Hemsworth",R.drawable.thor),
        MarvelChar("Iron Man", name = "Robert Downey Jr", R.drawable.iron_man),
        MarvelChar("Hulk", name = "Mark Ruffalo", R.drawable.hulk),
        MarvelChar("Wolverine", name = "James Howlett", R.drawable.wolverine),
        MarvelChar("spider-man", name = "Andrew Garfield", R.drawable.spider_man)

    )
}