package `object`

/**
 * Get the list of markets where Spotify is available.
 *
 * e.g.
 * ```json
 * {"markets": ["CA","BR","IT"]}
 * ```*/
data class Market(var markets: ArrayList<String>? = null)

