package `object`

import com.google.gson.annotations.SerializedName
import model.*

/**
 * Get Spotify catalog information for a single album.
 *
 * Important policy notes.
 * Spotify content may not be downloaded
 * You may not facilitate downloads of Spotify content or enable “stream ripping”.
 * [More information](https://developer.spotify.com/terms/#section-iv-restrictions:~:text=facilitating,make%20permanent%20copies%20of%20Spotify%20Content.)
 *
 * Keep visual content in its original form
 * Spotify visual content must be kept in its original form, e.g. you can not crop album artwork, overlay images on album artwork, place a brand/logo on album artwork
 * [More information](https://developer.spotify.com/documentation/design#using-our-content)
 *
 * Ensure content attribution
 * Please keep in mind that metadata, cover art and artist images must be accompanied by a link back to the applicable artist, album, track, or playlist on the Spotify Service. You must also attribute content from Spotify with the logo.
 * [More information](https://developer.spotify.com/policy/#ii-respect-content-and-creators:~:text=If%20you%20display%20any%20Spotify%20Content,on%20the%20Spotify%20Service.)*/
data class Album(
    /**
     * The [Spotify ID](https://developer.spotify.com/documentation/web-api/concepts/spotify-uris-ids) for the album.
     *
     * Example: `"4aawyAB9vmqN3uQ7FjRGTy"`*/
    @SerializedName(value = "id")
    var id: String? = null
) {
    /**
     * The type of the album.
     *
     * Allowed values:`"album"`,`"single"`,`"compilation"`
     *
     * Example: `"compilation"`
     * @see [enum.AlbumType]*/
    @SerializedName(value = "album_type")
    var albumType: String? = null

    /**
     * The number of tracks on the album.
     *
     * Example: `9`*/
    @SerializedName(value = "total_tracks")
    var totalTracks: Int = 0

    /**
     * The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
     *
     * NOTE: an album is considered available in a market when at least 1 of its tracks is available in that market.
     *
     * Example: `["CA","BR","IT"]`*/
    @SerializedName(value = "available_markets")
    var availableMarkets: ArrayList<String>? = null

    /**
     * Known external URLs for the album.*/
    @SerializedName(value = "external_urls")
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
     * The name of the album.
     *
     * In case of an album takedown, the value may be an empty string.*/
    @SerializedName(value = "name")
    var name: String? = null

    /**
     * The date the album was first released.
     *
     * Example: `"1981-12"`*/
    @SerializedName(value = "release_date")
    var releaseDate: String? = null

    /**
     * The precision with which [releaseDate] value is known.

    Allowed values:
    `"year"`,
    `"month"`,
    `"day"`.

    Example: `"year"`
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
     * Allowed value: `"album"`
     *
     * @see [enum.Type]*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The [Spotify URI](https://developer.spotify.com/documentation/web-api/concepts/spotify-uris-ids) for the album.
     *
     * Example: `"spotify:album:2up3OPMp9Tb4dAKM2erWXQ"`*/
    @SerializedName(value = "uri")
    var uri: String? = null

    /**
     * The artists of the album. Each artist object includes a link in href to more detailed information about the artist.*/
    @SerializedName(value = "artists")
    var artists: ArrayList<Artist>? = null

    /**
     * The tracks of the album.*/
    @SerializedName(value = "tracks")
    var tracks: Track? = null

    /**
     * The copyright statements of the album*/
    @SerializedName(value = "copyrights")
    var copyrights: ArrayList<Copyright>? = null

    /**
     * Known external IDs for the album*/
    @SerializedName(value = "external_ids")
    var externalIds: ExternalId? = null

    /**
     * `Deprecated` The array is always empty
     *
     * Example `[]`*/
    @Deprecated("The array is always emtpy.")
    @SerializedName(value = "genres")
    var genres: ArrayList<String>? = null

    /**
     * The label associated with the album*/
    @SerializedName(value = "label")
    var label: String? = null

    /**
     * The popularity of the album. The value will be between 0 and 100, with 100 being the most popular.*/
    @SerializedName(value = "popularity")
    var popularity: Int = 0
}
