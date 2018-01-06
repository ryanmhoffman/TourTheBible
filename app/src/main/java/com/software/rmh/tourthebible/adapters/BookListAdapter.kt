package com.software.rmh.tourthebible.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.software.rmh.tourthebible.R

/**
 * Created by rhoffman on 1/5/18.
 */
class BookListAdapter(private val context: Context) : RecyclerView.Adapter<BookListAdapter.BookHolder>() {

    class BookHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

        private val bookName = view.findViewById<TextView>(R.id.bookName)
        init {
            view.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            // TODO(rhoffman)
        }

        fun bindText(book: String) {
            bookName.text = book
        }

    }

    override fun getItemCount() = context.resources.getStringArray(R.array.all_books).size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListAdapter.BookHolder {
        val inflatedView = LayoutInflater.from(context).inflate(R.layout.book_cell, parent, false)
        return BookHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: BookListAdapter.BookHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}