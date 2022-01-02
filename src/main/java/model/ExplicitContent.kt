package model

import com.google.gson.annotations.SerializedName

data class ExplicitContent(
    /**
     * When true, indicates that explicit content should not be played.*/
    @SerializedName(value = "filter_enabled")
    var filterEnabled: Boolean = false,

    /**
     * When true, indicates that the explicit content settings is locked and can't be changes by the user.*/
    @SerializedName(value = "filter_locked")
    var filterLocked: Boolean = false
)
