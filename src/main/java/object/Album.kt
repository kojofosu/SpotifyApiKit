package `object`

import com.google.gson.annotations.SerializedName

data class Album(
    /**
     * The Spotify ID for the album.*/
    @SerializedName(value = "id")
    var id: String? = null
) {
    /**
     * The type of the album.
     * Allowed values:"album","single","compilation" @see AlbumType*/
    @SerializedName(value = "album_type")
    var albumType: String? = null

    /**
     * The number of tracks on the album.*/
    @SerializedName(value = "total_tracks")
    var totalTracks: Int = 0

    /**
     * The markets in which the album is available: ISO 3166-1 alpha-2 country codes.
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
    var images: ArrayList<SimpleImage>? = null

    /**
     * The name of the album. In case of an album takedown, the value may be an empty string.*/
    @SerializedName(value = "name")
    var name: String? = null

    /**
     * The Spotify URI for the album.*/
    @SerializedName(value = "uri")
    var uri: String? = null

    /**
     * The date the album was first released.*/
    @SerializedName(value = "release_date")
    var releaseDate: String? = null

    /**
     * The precision with which release_date value is known.

    Allowed values:
    "year",
    "month",
    "day". @see ReleaseDatePrecision*/
    @SerializedName(value = "release_date_precision")
    var releaseDatePrecision: String? = null

    /**
     * Included in the response when a content restriction is applied.*/
    @SerializedName(value = "restrictions")
    var restrictions: Restriction? = null

    /**
     * The object type.
     * Allowed value: "album"*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The artists of the album. Each artist object includes a link in href to more detailed information about the artist.*/
    @SerializedName(value = "artists")
    var artists: ArrayList<Artist>? = null

    /**
     * The tracks of the album.*/
    @SerializedName(value = "tracks")
    var tracks: SimpleTrack? = null
}
