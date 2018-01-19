package com.software.rmh.tourthebible.controllers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.software.rmh.tourthebible.R
import com.software.rmh.tourthebible.models.Bible
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        val text = Bible().getChapter("Genesis")
        chapterText.text = text
    }
}
