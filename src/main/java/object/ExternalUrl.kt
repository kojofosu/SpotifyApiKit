package `object`

import com.google.gson.annotations.SerializedName

data class ExternalUrl(
    /** The Spotify URL for the object.*/
    @SerializedName(value = "spotify") var spotify: String? = null
)