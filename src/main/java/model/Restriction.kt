package model

import com.google.gson.annotations.SerializedName

/**
 * Included in the response when a content restriction is applied. See [Restriction Object](https://developer.spotify.com/documentation/web-api/reference/#/) for more details.*/
data class Restriction(
    /**
     * reason
    string
    The reason for the restriction.
    Albums may be restricted if the content is not available in a given market, to the user's subscription type,
    or when the user's account is set to not play explicit content. Additional reasons may be added in the future.

    Allowed values:
    "market"
    "product"
    "explicit".

    * @see [enum.RestrictionReason]*/
    @SerializedName(value = "reason")
    var reason: String? = null
)