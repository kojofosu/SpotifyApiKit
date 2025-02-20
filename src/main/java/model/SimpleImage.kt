package model

import com.google.gson.annotations.SerializedName

data class SimpleImage(
    /** The source URL of the image.
     *
     * Example: `"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228"`*/
    @SerializedName(value = "url")
    var url: String? = null,

    /** The image height in pixels.
     *
     * Example: `300`*/
    @SerializedName(value = "height")
    var height: Int? = 0,

    /** The image width in pixels
     *
     * Example: `300`*/
    @SerializedName(value = "width")
    var width: Int? = 0
)
