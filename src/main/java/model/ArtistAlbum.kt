package model

import com.google.gson.annotations.SerializedName
import `object`.Artist
import kotlin.collections.ArrayList

data class ArtistAlbum(
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
    var items: ArrayList<AlbumItems>? = null

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

    data class AlbumItems(
        @SerializedName(value = "name")
        var name: String? = null
    ) {
        @SerializedName(value = "album_group")
        var albumGroup: String? = null

        @SerializedName(value = "album_type")
        var albumType: String? = null

        @SerializedName(value = "artists")
        var artists: ArrayList<Artist>? = null

        @SerializedName(value = "available_markets")
        var availableMarkets: ArrayList<String>? = null

        @SerializedName(value = "external_urls")
        var externalUrls: ExternalUrl? = null

        @SerializedName(value = "href")
        var href: String? = null

        @SerializedName(value = "id")
        var id: String? = null

        @SerializedName(value = "images")
        var images: ArrayList<SimpleImage>? = null

        @SerializedName(value = "release_date")
        var releaseDate: String? = null

        @SerializedName(value = "release_date_precision")
        var releaseDatePrecision: String? = null

        @SerializedName(value = "total_tracks")
        var totalTracks: Int = 0

        @SerializedName(value = "type")
        var type: String? = null

        @SerializedName(value = "uri")
        var uri: String? = null
    }
}
