package model

import com.google.gson.annotations.SerializedName

data class Copyright(
    /**
     * The copyright statements of the show.*/
    @SerializedName(value = "text")
    var text: String? = null,

    /**
     * The type of copyright: C = the copyright, P = the sound recording (performance) copyright*/
    @SerializedName(value = "type")
    var type: String? = null
)
