package com.software.rmh.tourthebible.models

import com.google.gson.annotations.SerializedName

/**
 * Created by rhoffman on 1/17/18.
 */
data class Chapter(@SerializedName("verse_nr") val verseNumber: Int,
                   val verse: String)
