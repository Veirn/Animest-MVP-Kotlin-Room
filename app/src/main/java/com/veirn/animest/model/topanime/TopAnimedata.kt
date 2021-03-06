package com.veirn.animest.model.topanime

import com.google.gson.annotations.SerializedName

data class TopAnimedata(
    @SerializedName("request_cache_expiry")
    val requestCacheExpiry: Int, // 34658
    @SerializedName("request_cached")
    val requestCached: Boolean, // true
    @SerializedName("request_hash")
    val requestHash: String, // request:top:58399c95e55435d6ccef63eef7ce609974e4f2d5
    @SerializedName("top")
    val top: List<TopAnime>,
    @SerializedName("results")
    val results: List<TopAnime>


)