package `object`

/**
 * Retrieve a list of available genres seed parameter values for [recommendations](https://developer.spotify.com/documentation/web-api/reference/#/operations/get-recommendations).*/
data class Genre(var genres: ArrayList<String>? = null)
