package model

import com.google.gson.annotations.SerializedName
import `object`.Track
import java.util.*
import kotlin.collections.ArrayList

/*todo do track*/
data class SimpleTrack(
    /** The total number of items available to return.*/
    @SerializedName(value = "total")
    var total: Int = 0
) {
    /**
     * A link to the Web API endpoint returning the full result of the request.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * The requested content*/
    @SerializedName(value = "items")
    var items: ArrayList<Objects>? = null

    /**
     * The maximum number of items in the response (as set in the query or by default).*/
    @SerializedName(value = "limit")
    var limit: Int = 0

    /**
     * URL to the next page of items. (null if none).*/
    @SerializedName(value = "next")
    var next: String? = null

    /**
     * The offset of the items returned (as set in the query or by default)*/
    @SerializedName(value = "offset")
    var offset: Int = 0

    /**
     * URL to the previous page of items. (null if none*/
    @SerializedName(value = "previous")
    var previous: String? = null
}
