package `object`

import com.google.gson.annotations.SerializedName
import model.*

data class Playlist(
    /**
     * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the playlist*/
    @SerializedName(value = "id")
    var id: String? = null,

    /**
     * The name of the playlist.*/
    @SerializedName(value = "name")
    var name: String? = null
) {
    /**
     * true if the owner allows other users to modify the playlist.*/
    @SerializedName(value = "collaborative")
    var collaborative: Boolean = false

    /**
     * The playlist description. Only returned for modified, verified playlists, otherwise null.*/
    @SerializedName(value = "description")
    var description: String? = null

    /**
     * Known external URLs for this playlist.*/
    @SerializedName(value = "external_urls")
    var externalUrls: ExternalUrl? = null

    /**
     * Information about the followers of the playlist.*/
    @SerializedName(value = "followers")
    var followers: Followers? = null

    /**
     * A link to the Web API endpoint providing full details of the playlist.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * Images for the playlist. The array may be empty or contain up to three images.
     * The images are returned by size in descending order. See [Working with Playlists](https://developer.spotify.com/documentation/general/guides/working-with-playlists/).
     *Note: If returned, the source URL for the image (url) is temporary and will expire in less than a day.*/
    @SerializedName(value = "images")
    var images: ArrayList<SimpleImage>? = null

    /**
     * The user who owns the playlist.*/
    @SerializedName(value = "owner")
    var owner: Owner? = null

    /**
     * The playlist's public/private status: true the playlist is public, false the playlist is private, null the playlist status is not relevant.
     * For more about public/private status, see [Working with Playlists](https://developer.spotify.com/documentation/general/guides/working-with-playlists/)*/
    @SerializedName(value = "public")
    var public: Boolean = false

    /**
     * The version identifier for the current playlist.
     * Can be supplied in other requests to target a specific playlist version*/
    @SerializedName(value = "snapshot_id")
    var snapshotId: String? = null

    /**
     * The tracks of the playlist.*/
    @SerializedName(value = "tracks")
    var tracks: SimpleTrack? = null

    /**
     * The object type
     *
     * Allowed values: "playlist"
     *
     * @see [enum.Type]*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the playlist.*/
    @SerializedName(value = "uri")
    var uri: String? = null
}
