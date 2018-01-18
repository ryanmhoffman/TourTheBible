package com.software.rmh.tourthebible.models

import com.google.gson.annotations.SerializedName

/**
 * Created by rhoffman on 1/17/18.
 */
data class Book(val type: String,
                val version: String,
                @SerializedName("book_name") val bookName: String,
                @SerializedName("book_nr") val bookNumber: Int,
                @SerializedName("chapter_nr") val chapterNumber: Int,
                val direction: String,
                val chapter: Chapter)