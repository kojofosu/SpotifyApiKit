package model

import com.google.gson.annotations.SerializedName

data class SimpleImage(
    /** The source URL of the image.*/
    @SerializedName(value = "url")
    var url: String? = null,

    /** The image height in pixels.*/
    @SerializedName(value = "height")
    var height: Int = 0,

    /** The image width in pixels*/
    @SerializedName(value = "width")
    var width: Int = 0
)
