package `object`

import com.google.gson.annotations.SerializedName
import model.*
import java.io.Serial

/**
 * Get Spotify catalog information for a single track identified by its unique Spotify ID.
 * */
data class Track(
    /**
     * The name of the track*/
    @SerializedName(value = "name")
    var name: String? = null
) {
    /**
     * The album on which the track appears. The album object includes a link in href to full information about the album.*/
    @SerializedName(value = "album")
    var album: TrackAlbum? = null

    /**
     * The artists who performed the track. Each artist object includes a link in href to more detailed information about the artist.*/
    @SerializedName(value = "artists")
    var artists: Artists? = null

    /**
     * A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2 code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)*/
    @SerializedName(value = "available_markets")
    var availableMarkets: ArrayList<String>? = null

    /**
     * The disc number (usually 1 unless the album consists of more than one disc).*/
    @SerializedName(value = "disc_number")
    var discNumber: Int = 0

    /**
     * The track length in milliseconds.*/
    @SerializedName(value = "duration_ms")
    var durationMs: Long = 0

    /**
     * Whether or not the track has explicit lyrics ( true = yes it does; false = no it does not OR unknown).*/
    @SerializedName(value = "explicit")
    var explicit: Boolean = false

    /**
     * Known external IDs for the track.*/
    @SerializedName(value = "external_ids")
    var externalIds: ExternalId? = null

    /**
     * Known external URLs for the track.*/
    @SerializedName(value = "external_urls")
    var externalUrls: ExternalUrl? = null

    /**
     * A link to the Web API endpoint providing full details of the track.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the show.*/
    @SerializedName(value = "id")
    var id: String? = null

    /**
     * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied.
     * If true, the track is playable in the given market. Otherwise false*/
    @SerializedName(value = "is_playable")
    var isPlayable: Boolean = true

    /**
     * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied, and the requested track has been replaced with different track.
     * The track in the linked_from object contains information about the originally requested track.*/
    @SerializedName(value = "linked_from")
    var linkedFrom: Object? = null

    /**
     * Included in the response when a content restriction is applied.*/
    @SerializedName(value = "restrictions")
    var restrictions: Restriction? = null

    /**
     * The popularity of the track. The value will be between 0 and 100, with 100 being the most popular.
     * The popularity of a track is a value between 0 and 100, with 100 being the most popular.
     * The popularity is calculated by algorithm and is based, in the most part, on the total number of plays the track has had and how recent those plays are.
     * Generally speaking, songs that are being played a lot now will have a higher popularity than songs that were played a lot in the past.
     * Duplicate tracks (e.g. the same track from a single and an album) are rated independently. Artist and album popularity is derived mathematically from track popularity.
     * Note: the popularity value may lag actual popularity by a few days: the value is not updated in real time.*/
    @SerializedName(value = "popularity")
    var popularity: Int = 0

    /**
     * A link to a 30 second preview (MP3 format) of the track. Can be null*/
    @SerializedName(value = "preview_url")
    var previewUrl: String? = null

    /**
     * The number of the track. If an album has several discs, the track number is the number on the specified disc.*/
    @SerializedName(value = "track_number")
    var trackNumber: Int = 0

    /**
     * The object type: "track".
     *
     * Allowed value:
     * "track"*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The Spotify URI for the track.*/
    @SerializedName(value = "uri")
    var uri: String? = null

    /**
     * Whether the track is from a local file.*/
    @SerializedName(value = "is_local")
    var isLocal: Boolean = false

    /**
     * The album on which the track appears. The album object includes a link in href to full information about the album.*/
    data class TrackAlbum(
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

        @SerializedName(value = "popularity")
        var popularity: Int = 0

        @SerializedName(value = "restrictions")
        var restrictions: Restriction? = null

        @SerializedName(value = "copyrights")
        var copyrights: ArrayList<Copyright>? = null

        @SerializedName(value = "external_ids")
        var externalIds: ExternalId? = null

        @SerializedName(value = "genres")
        var genres: ArrayList<String>? = null

        @SerializedName(value = "label")
        var label: String? = null

    }
}
