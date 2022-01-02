package `object`

import com.google.gson.annotations.SerializedName
import model.SimpleTrack

data class Album(
    /**
     * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the album.*/
    @SerializedName(value = "id")
    var id: String? = null
) {
    /**
     * The type of the album.
     *
     * Allowed values:"album","single","compilation"
     * @see [enum.AlbumType]*/
    @SerializedName(value = "album_type")
    var albumType: String? = null

    /**
     * The number of tracks on the album.*/
    @SerializedName(value = "total_tracks")
    var totalTracks: Int = 0

    /**
     * The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     * NOTE: an album is considered available in a market when at least 1 of its tracks is available in that market.*/
    @SerializedName(value = "available_markets")
    var availableMarkets: ArrayList<String>? = null

    /**
     * Known external URLs for the album.*/
    @SerializedName(value = "available_markets")
    var externalUrls: ExternalUrl? = null

    /**
     * A link to the Web API endpoint providing full details of the album.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * The cover art for the album in various sizes, the widest first.*/
    @SerializedName(value = "images")
    var images: ArrayList<Image>? = null

    /**
     * The name of the album.
     *
     * In case of an album takedown, the value may be an empty string.*/
    @SerializedName(value = "name")
    var name: String? = null

    /**
     * The date the album was first released.*/
    @SerializedName(value = "release_date")
    var releaseDate: String? = null

    /**
     * The precision with which [releaseDate] value is known.

    Allowed values:
    "year",
    "month",
    "day".

    @see [enum.ReleaseDatePrecision]*/
    @SerializedName(value = "release_date_precision")
    var releaseDatePrecision: String? = null

    /**
     * Included in the response when a content restriction is applied.*/
    @SerializedName(value = "restrictions")
    var restrictions: Restriction? = null

    /**
     * The object type.
     *
     * Allowed value: "album"
     *
     * @see [enum.Type]*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the album.*/
    @SerializedName(value = "uri")
    var uri: String? = null

    /**
     * The artists of the album. Each artist object includes a link in href to more detailed information about the artist.*/
    @SerializedName(value = "artists")
    var artists: ArrayList<Artist>? = null

    /**
     * The tracks of the album.*/
    @SerializedName(value = "tracks")
    var tracks: SimpleTrack? = null

    /**
     * Known external URLs for this album.*/
    data class ExternalUrl(
        /** The [Spotify URL](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the object.*/
        @SerializedName(value = "spotify") var spotify: String? = null
    )

    /**
     * The cover art for the album in various sizes, the widest first.*/
    data class Image(
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

    /**
     * Included in the response when a content restriction is applied.*/
    data class Restriction(
        /**
         *The reason for the restriction.
         *
         * Albums may be restricted if the content is not available in a given market, to the user's subscription type,
        or when the user's account is set to not play explicit content. Additional reasons may be added in the future.

        * Allowed values:
        "market"
        "product"
        "explicit".

        * @see [enum.RestrictionReason]*/
        @SerializedName(value = "reason")
        var reason: String? = null
    )
}
