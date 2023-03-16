package `object`

import com.google.gson.annotations.SerializedName

/**
 * Get Spotify catalog information for several artists based on their Spotify IDs.*/
data class Artists(
    /**
     * A set of artists*/
    @SerializedName(value = "artists")
    var artists: ArrayList<Artist>? = null
    )
