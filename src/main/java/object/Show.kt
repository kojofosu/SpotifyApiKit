package `object`

import com.google.gson.annotations.SerializedName
import model.Copyright
import model.ExternalUrl
import model.SimpleEpisode
import model.SimpleImage
import kotlin.collections.ArrayList

data class Show(
    /**
     * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the show.*/
    @SerializedName(value = "id")
    var id: String? = null
) {
    /**
     * A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2 code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)*/
    @SerializedName(value = "available_markets")
    var availableMarkets: ArrayList<String>? = null

    /**
     * The copyright statements of the show*/
    @SerializedName(value = "copyrights")
    var copyrights: ArrayList<Copyright>? = null

    /**
     * A description of the show. HTML tags are stripped away from this field,
     * use html_description field in case HTML tags are needed.*/
    @SerializedName(value = "description")
    var description: String? = null

    /**
     * A description of the show. This field may contain HTML tags.*/
    @SerializedName(value = "html_description")
    var htmlDescription: String? = null

    /**
     * Whether the show has explicit content or not (true = yes it does; false = no it does not OR unknown).*/
    @SerializedName(value = "explicit")
    var explicit: Boolean = false

    /**
     * External URLs for this show.*/
    @SerializedName(value = "external_urls")
    var externalUrls: ExternalUrl? = null

    /**
     * A link to eh Web API endpoint providing full details of the show.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * The cover art for the show in various sizes, the widest firs.*/
    @SerializedName(value = "images")
    var images: ArrayList<SimpleImage>? = null

    /**
     * True if all the show's episodes are hosted outside of Spotify's CDN. This field might be null in some cases.*/
    @SerializedName(value = "is_externally_hosted")
    var isExternallyHosted: Boolean = false

    /**
     * A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.*/
    @SerializedName(value = "languages")
    var languages: ArrayList<String>? = null

    /**
     * The media type of the show.*/
    @SerializedName(value = "media_type")
    var mediaType: String? = null

    /**
     * The name of the episode.*/
    @SerializedName(value = "name")
    var name: String? = null

    /**
     * The publisher of the show.*/
    @SerializedName(value = "publisher")
    var publisher: String? = null

    /**
     * The object type.
     *
     * Allowed value: "show"
     *
     * @see [enum.Type]*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the show*/
    @SerializedName(value = "uri")
    var uri: String? = null

    /**
     * The episodes of the show.*/
    @SerializedName(value = "episodes")
    var episodes: SimpleEpisode? = null

}
