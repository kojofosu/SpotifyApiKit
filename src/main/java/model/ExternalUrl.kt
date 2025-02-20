package model

import com.google.gson.annotations.SerializedName

data class ExternalUrl(
    /** The [Spotify URL](https://developer.spotify.com/documentation/web-api/concepts/spotify-uris-ids) for the object.*/
    @SerializedName(value = "spotify")
    var spotify: String? = null
)