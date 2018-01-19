package com.software.rmh.tourthebible.views

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.software.rmh.tourthebible.R
import com.software.rmh.tourthebible.controllers.BooksActivity

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
            bookList!!.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                val intent = Intent(view.context, BooksActivity::class.java)
                view.context.startActivity(intent)
                //Toast.makeText(parent.context, "Clicked " + allBooks!![position], Toast.LENGTH_SHORT).show()
                }

        }
        return view
    }

    companion object {

        fun newInstance(): BooksFragment {
            return BooksFragment()
        }
    }
}