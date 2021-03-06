package com.software.rmh.tourthebible.views

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.software.rmh.tourthebible.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [AboutFragment.OnAboutFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutFragment : Fragment() {

    //private var listener: OnAboutFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_about, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        //if (context is OnAboutFragmentInteractionListener) {
            //listener = context
        //} else {
            //throw RuntimeException(context!!.toString() + " must implement OnAboutFragmentInteractionListener")
        //}
    }

    override fun onDetach() {
        super.onDetach()
        //listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     */
    //interface OnAboutFragmentInteractionListener {
        // TODO: Update argument type and name
    //    fun onFragmentInteraction(uri: Uri)
    //}

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AboutFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(): AboutFragment {
            //val args = Bundle()
            //args.putString(ARG_PARAM1, param1)
            //args.putString(ARG_PARAM2, param2)
            //fragment.arguments = args
            return AboutFragment()
        }
    }
}
