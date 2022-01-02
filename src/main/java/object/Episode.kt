package `object`

import com.google.gson.annotations.SerializedName
import model.ExternalUrl
import model.Restriction
import model.SimpleImage
import model.SimpleResumePoint
import kotlin.collections.ArrayList

data class Episode(
    /**
     * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the episode.*/
    @SerializedName(value = "id")
    var id: String? = null,

    /**
     * The name of the episode*/
    @SerializedName(value = "name")
    var name: String? = null
) {
    /**
     * A URL to a 30-second preview (MP3 format) of the episode. null if not available*/
    @SerializedName(value = "audio_preview_url")
    var audioPreviewUrl: String? = null

    /**
     * A description of the episode. HTML tags are stripped away from this field, use html_description field in case HTML tags are needed.*/
    @SerializedName(value = "description")
    var description: String? = null

    /**
     * A description of the episode. This field may contain HTML tags.*/
    @SerializedName(value = "html_description")
    var htmlDescription: String? = null

    /**
     * The episode length in milliseconds.*/
    @SerializedName(value = "duration_ms")
    var durationMs: Int = 0

    /**
     * Whether the episode has explicit content or not (true = yes it does; false = no it does not OR unknown).*/
    @SerializedName(value = "explicit")
    var explicit: Boolean = false

    /**
     * External URLs for the episode.*/
    @SerializedName(value = "external_urls")
    var externalUrls: ExternalUrl? = null

    /**
     * A link to the Web API endpoint providing full details of the episode.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * The cover art for the episode in various sizes, the widest first.*/
    @SerializedName(value = "images")
    var images: ArrayList<SimpleImage>? = null

    /**
     * True if the episode is hosted outside of Spotify's CDN.*/
    @SerializedName(value = "is_externally_hosted")
    var isExternallyHosted: Boolean = false

    /**
     * True if the episode is playable in the given market. Otherwise, false.*/
    @SerializedName(value = "is_playable")
    var isPlayable: Boolean = false

    /**
     * The language used in the episode, identified by a ISO 639 code.
     * This field is deprecated and might be removed in the future. Please use the languages' field instead. */
    @SerializedName(value = "languages")
    var languages: ArrayList<String>? = null


    /**
     * The date the episode was first released, for example "1981-12-15".
     * Depending on the precision, it might be shown as "1981" or "1981-12".*/
    @SerializedName(value = "release_date")
    var releaseDate: String? = null

    /**
     * The precision with which [releaseDate] value is known.
     *
     * Allowed values: "year", "month" , "day"
     *
     * @see [enum.ReleaseDatePrecision]*/
    @SerializedName(value = "release_date_precision")
    var releaseDatePrecision: String? = null


    /**
     * The user's most recent position in the episode.
     * Set if the supplied access token is a user token and has the scope 'user-read-playback-position'.*/
    @SerializedName(value = "resume_point")
    var resumePoint: SimpleResumePoint? = null

    /**
     * The object type.
     *
     * Allowed values: "episode"
     *
     * @see [enum.Type]*/
    @SerializedName(value = "type")
    var type: String? = null

    /**
     * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the episode.*/
    @SerializedName(value = "uri")
    var uri: String? = null

    /**
     * Included in the response when a content restriction is applied.
     * See [Restriction] Object for more details.*/
    @SerializedName(value = "restrictions")
    var restrictions: Restriction? = null

    /**
     * Returns shows*/
    @SerializedName(value = "show")
    var show: Show? = null
}
