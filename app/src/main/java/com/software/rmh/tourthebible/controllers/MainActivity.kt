package com.software.rmh.tourthebible.controllers

import android.app.Fragment
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.software.rmh.tourthebible.R
import com.software.rmh.tourthebible.views.AboutFragment
import com.software.rmh.tourthebible.views.BooksFragment
import com.software.rmh.tourthebible.views.VersionsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val manager = fragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            manager.beginTransaction()
                    .add(R.id.container, BooksFragment.newInstance(), BOOKS_FRAGMENT_KEY)
                    .commit()
        }
        initViews()
    }

    private fun initViews() {
        val books = AHBottomNavigationItem(getString(R.string.books),
                ContextCompat.getDrawable(this, R.drawable.icon_book))
        val versions = AHBottomNavigationItem(getString(R.string.versions),
                ContextCompat.getDrawable(this, R.drawable.icon_bible))
        val about = AHBottomNavigationItem(getString(R.string.about),
                ContextCompat.getDrawable(this, R.drawable.ic_about))

        bottomNav.addItem(versions)
        bottomNav.addItem(books)
        bottomNav.addItem(about)

        bottomNav.isBehaviorTranslationEnabled = true
        bottomNav.currentItem = 1

        bottomNav.setOnTabSelectedListener { position, _ ->
            changeFragment(position)
            true
        }
    }

    private fun changeFragment(position: Int) {
        when(position) {
            0 -> replaceCurrentFragment(VERSIONS_FRAGMENT_KEY, VersionsFragment.newInstance())
            1 -> replaceCurrentFragment(BOOKS_FRAGMENT_KEY, BooksFragment.newInstance())
            2 -> replaceCurrentFragment(ABOUT_FRAGMENT_KEY, AboutFragment.newInstance())
        }
    }

    private fun replaceCurrentFragment(key: String, fragment: Fragment) {
        manager.beginTransaction().replace(R.id.container, fragment, key).commit()
    }

    companion object {
        private val BOOKS_FRAGMENT_KEY = "BooksFragment"
        private val VERSIONS_FRAGMENT_KEY = "VersionsFragment"
        private val ABOUT_FRAGMENT_KEY = "AboutFragment"
    }
}
