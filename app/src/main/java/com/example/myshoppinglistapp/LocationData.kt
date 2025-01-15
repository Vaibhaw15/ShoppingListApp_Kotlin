package com.example.myshoppinglistapp

data class LocationData(
    val latitute :Double,
    val longitute:Double)

data class GeocoadingResponse(
    val results: List<GeocodingResult>,
    val status:String
)

data class GeocodingResult(
    val formatted_address: String
)