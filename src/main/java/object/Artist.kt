package `object`

import com.google.gson.annotations.SerializedName
import model.ExternalUrl
import model.Followers
import model.SimpleImage

/**
 * The artists of the album. Each artist object includes a link in href to more detailed information about the artist.*/
data class Artist(
    /** The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the artist.The Spotify ID for the artist.*/
    @SerializedName(value = "id")
    var id: String? = null
) {
    /**
     * Known external URLs for the album.*/
    @SerializedName(value = "external_urls")
    var externalUrls: ExternalUrl? = null

    /**
     * Information about the followers of the artist.*/
    @SerializedName(value = "followers")
    var followers: Followers? = null

    /**
     * A list of the genres the artist is associated with. If not yet classified, the array is empty.*/
    @SerializedName(value = "genres")
    var genres: ArrayList<String>? = null

    /**
     * A link to the Web API endpoint providing full details of the artist.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * Images of the artis in various size, the widest first.*/
    @SerializedName(value = "images")
    var images: ArrayList<SimpleImage>? = null

    /**
     * The name of the artist*/
    @SerializedName(value = "name")
    var name: String? = null

    /**
     * The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist's popularity is calculated from the popularity of all the artist's tracks.*/
    @SerializedName(value = "popularity")
    var popularity: Int = 0

    /**
     * The object type.
     *
     * Allowed value: "artist
     *
     * @see [enum.Type]*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the artist.*/
    @SerializedName(value = "uri")
    var uri: String? = null
}
