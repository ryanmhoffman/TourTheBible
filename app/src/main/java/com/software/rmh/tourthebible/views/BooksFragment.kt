package com.software.rmh.tourthebible.views

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.software.rmh.tourthebible.R
import com.software.rmh.tourthebible.adapters.BookListAdapter

/**
 * A simple [Fragment] subclass. This fragment will display all 66 books of the Bible in
 * order in a [RecyclerView].
 *
 * Use the [BooksFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BooksFragment : Fragment() {

    private var bookList: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_books, container, false)

        if(view is RecyclerView){
            bookList = view
            bookList!!.adapter = BookListAdapter(this.activity)
            val divider = DividerItemDecoration(this.activity, DividerItemDecoration.VERTICAL)
            bookList!!.addItemDecoration(divider)
        }
        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

    }

    override fun onDetach() {
        super.onDetach()
    }

    companion object {

        fun newInstance(): BooksFragment {
            return BooksFragment()
        }
    }
}