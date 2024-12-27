package np.com.bimalkafle.listdemoapp

data class MarvelChar(
    var chatName : String,
    var name : String,
    var imageRes : Int,
)


fun getAllMarvelChars() : List<MarvelChar>{
    return listOf<MarvelChar>(
        MarvelChar("Thor", "Chris Hemsworth",R.drawable.thor),
    )
}