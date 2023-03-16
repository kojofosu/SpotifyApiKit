package model

/**
 * Known external IDs*/
data class ExternalId(
    /**
     *[International Standard Recording Code](https://en.wikipedia.org/wiki/International_Standard_Recording_Code) */
    var isrc: String? = null,
    /**
     *[International Article Number](https://en.wikipedia.org/wiki/International_Article_Number) */
    var ean: String? = null,
    /**
     *[Universal product code Code](https://en.wikipedia.org/wiki/Universal_Product_Code) */
    var upc: String? = null
)
