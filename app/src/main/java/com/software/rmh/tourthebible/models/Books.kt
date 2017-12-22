package com.software.rmh.tourthebible.models

import com.google.gson.annotations.SerializedName

/**
 * Created by rhoffman on 12/18/17.
 */
data class Books(
        @SerializedName("book_name") val bookName: String,
        @SerializedName("book_nr") val bookNumber: Int,
        @SerializedName("ref") val bookRefName: String
)
