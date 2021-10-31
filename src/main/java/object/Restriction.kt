package `object`

import com.google.gson.annotations.SerializedName

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
    "explicit". @see Reason*/
    @SerializedName(value = "reason")
    var reason: String? = null
)