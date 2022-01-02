package model

import com.google.gson.annotations.SerializedName

data class Owner(
    /**
      * The Spotify ID for the user.*/
     @SerializedName(value = "id")
     var id: String? = null,

     /**
      * The name displayed on the user's profile. null if not available.*/
     @SerializedName(value = "display_name")
     var displayName: String? = null
){
    /**
     * Known external URLs for this user.*/
    @SerializedName(value = "external_urls")
    var externalUrls: ExternalUrl? = null

    /**
     * Information about the followers of the user.*/
    @SerializedName(value = "followers")
    var followers: Followers? = null

    /**
     * A link to the Web API endpoint for the user.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * The user's profile image*/
    @SerializedName(value = "images")
    var images: ArrayList<SimpleImage>? = null

    /**
     * The object type, "user"*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The Spotify URI for the user.*/
    @SerializedName(value = "uri")
    var uri: String? = null
}
