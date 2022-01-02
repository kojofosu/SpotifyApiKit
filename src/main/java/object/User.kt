package `object`

import com.google.gson.annotations.SerializedName
import model.ExplicitContent
import model.ExternalUrl
import model.Followers
import model.SimpleImage

data class User(
    /**
     * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the user.*/
    @SerializedName(value = "id")
    var id: String? = null,

    /**
     * The name displayed on the user's profile. null if not available.*/
    @SerializedName(value = "display_name")
    var displayName: String? = null
) {
    /**
     * The country of the user, as set in the user's account profile. An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     * This field is only available when the current user has granted access to the [user-read-private](https://developer.spotify.com/documentation/general/guides/authorization/) scope.*/
    @SerializedName(value = "country")
    var country: String? = null

    /**
     * The user's email address, as entered by the user when creating their account.
     * Important! This email address is unverified; there is no proof that it actually belongs to the user.
     * This field is only available when the current user has granted access to the [user-read-email](https://developer.spotify.com/documentation/general/guides/authorization/) scope.*/
    @SerializedName(value = "email")
    var email: String? = null

    /**
     * The user's explicit content settings. This field is only available when the current user has granted access to the [user-read-private](https://developer.spotify.com/documentation/general/guides/authorization/) scope.*/
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
     * This field is only available when the current user has granted access to the [user-read-private](https://developer.spotify.com/documentation/general/guides/authorization/) scope.*/
    @SerializedName(value = "product")
    var product: String? = null

    /**
     * The object type.
     *
     * Allowed values: "user"
     *
     * @see [enum.Type]*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the user.*/
    @SerializedName(value = "uri")
    var uri: String? = null
}
