package model

import com.google.gson.annotations.SerializedName

data class Followers(
    /** The total number of followers*/
    @SerializedName(value = "total")
    var total: Int = 0
){
    /**
     * This will always be null, as the Web API does not support it at the moment.*/
    @SerializedName(value = "href")
    var href: String? = null
}
