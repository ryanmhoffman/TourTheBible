package com.software.rmh.tourthebible.controllers

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.software.rmh.tourthebible.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val books = AHBottomNavigationItem(getString(R.string.books),
                ContextCompat.getDrawable(this, R.drawable.icon_book))
        val versions = AHBottomNavigationItem(getString(R.string.versions),
                ContextCompat.getDrawable(this, R.drawable.icon_bible))
        val about = AHBottomNavigationItem(getString(R.string.about),
                ContextCompat.getDrawable(this, R.drawable.ic_about))

        bottomNav.addItem(books)
        bottomNav.addItem(versions)
        bottomNav.addItem(about)

        bottomNav.isBehaviorTranslationEnabled = true
        bottomNav.currentItem = 1
    }
}
