package `object`

import com.google.gson.annotations.SerializedName

data class Category(
    /**
     * The Spotify category ID of the category.*/
    @SerializedName(value = "id")
    var id: String? = null,

    /**
     * the name of the category.*/
    @SerializedName(value = "name")
    var name: String? = null
) {
    /**
     * A link to the Web API endpoint returning full details of the category.*/
    @SerializedName(value = "href")
    var href: String? = null

    /**
     * The category icon, in various sizes.*/
    @SerializedName(value = "icons")
    var icons: ArrayList<SimpleImage>? = null
}
