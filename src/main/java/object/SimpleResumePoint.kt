package `object`

import com.google.gson.annotations.SerializedName

/**
 * The user's most recent position in the episode.
 * Set if the supplied access token is a user token and has the scope 'user-read-playback-position'.*/
data class SimpleResumePoint(
    /**
     * Whether or not the episode has been fully played by the user.*/
    @SerializedName(value = "fully_played")
    var fullyPlayed: Boolean = false,

    /**
     * The user's most recent position in the episode in milliseconds.*/
    @SerializedName(value = "resume_position_ms")
    var resumePositionMs: Int = 0
)
