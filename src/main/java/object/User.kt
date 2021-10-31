package `object`

import com.google.gson.annotations.SerializedName

data class User(
    /**
     * The Spotify ID for the user.*/
    @SerializedName(value = "id")
    var id: String? = null,

    /**
     * The name displayed on the user's profile. null if not available.*/
    @SerializedName(value = "display_name")
    var displayName: String? = null
) {
    /**
     * The country of the user, as set in the user's account profile. An ISO 3166-1 alpha-2 country code.
     * This field is only available when the current user has granted access to the user-read-private scope.*/
    @SerializedName(value = "country")
    var country: String? = null

    /**
     * The user's email address, as entered by the user when creating their account.
     * Important! This email address is unverified; there is no proof that it actually belongs to the user.
     * This field is only available when the current user has granted access to the user-read-email scope.*/
    @SerializedName(value = "email")
    var email: String? = null

    /**
     * The user's explicit content settings. This field is only available when the current user has granted access to the user-read-private scope.*/
    @SerializedName(value = "explicit_content")
    var explicitContent: ExplicitContent? = null

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
     * The user's Spotify subscription level: "premium", "free", etc. (The subscription level "open" can be considered the same as "free".)
     * This field is only available when the current user has granted access to the user-read-private scope.*/
    @SerializedName(value = "product")
    var product: String? = null

    /**
     * The object type, "user"*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The Spotify URI for the user.*/
    @SerializedName(value = "uri")
    var uri: String? = null
}
