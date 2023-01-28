package es.kankit.camkit.Interficie

class CryptoGecko (
    var id: String?,
    var symbol: String?,
    var name: String?,
    var image: String?,
    var current_price: Double?,
    var market_cap: Double?,
    var market_cap_rank: Int?,
    var fully_diluted_valuation: Double?,
    var total_volume: Double?,
    var high_24h: Double?,
    var low_24h: Double?,
    var price_change_24h: Double?,
    var price_change_percentage_24h: Double?,
    var market_cap_change_24h: Double?,
    var market_cap_change_percentage_24h: Double?,
    var circulating_supply: Double?,
    var total_supply: Double?,
    var max_supply: Double?,
    var ath: Double?,
    var ath_change_percentage: Double?,
    var ath_date: String?,
    var atl: Double?,
    var atl_change_percentage: Double?,
    var atl_date: String?,
    var roi: Roi?,
    var last_updated: String?,
)

class Roi (
    var times: Double?,
    var currency: String?,
    var percentage: Double?,
)