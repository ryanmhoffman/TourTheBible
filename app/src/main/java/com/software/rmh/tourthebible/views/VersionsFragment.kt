package com.software.rmh.tourthebible.views

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.software.rmh.tourthebible.R

/**
 * A simple [Fragment] subclass.
 * Use the [VersionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VersionsFragment : Fragment() {

    private var versionList: ListView? = null
    private var versions: Array<String>? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_versions, container, false)

        versions = view.context.resources.getStringArray(R.array.versions)

        if(view is ListView){
            versionList = view
            val adapter = ArrayAdapter(view.context, android.R.layout.simple_list_item_1,
                    versions)
            versionList!!.adapter = adapter

            versionList!!.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(parent.context, "Clicked " + versions!![position], Toast.LENGTH_SHORT).show() }
        }

        return view
    }


    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment VersionsFragment.
         */
        fun newInstance(): VersionsFragment {
            return VersionsFragment()
        }
    }
}
