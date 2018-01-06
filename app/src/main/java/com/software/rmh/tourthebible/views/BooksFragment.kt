package com.software.rmh.tourthebible.views

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.software.rmh.tourthebible.R

/**
 * A simple [Fragment] subclass. This fragment will display all 66 books of the Bible in
 * order in a [RecyclerView].
 *
 * Use the [BooksFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BooksFragment : Fragment() {

    private var bookList: ListView? = null
    private var allBooks: Array<String>? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.fragment_books, container, false)

        allBooks = view.context.resources.getStringArray(R.array.all_books)

        if(view is ListView){
            bookList = view
            val adapter = ArrayAdapter(view.context, android.R.layout.simple_list_item_1,
                    allBooks)
            bookList!!.adapter = adapter
        }
        return view
    }

    companion object {

        fun newInstance(): BooksFragment {
            return BooksFragment()
        }
    }
}