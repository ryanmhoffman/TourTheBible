package com.software.rmh.tourthebible.views

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.software.rmh.tourthebible.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [VersionsFragment.OnVersionsFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [VersionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VersionsFragment : Fragment() {

    //private var listener: OnVersionsFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_versions, container, false)
    }

    //override fun onAttach(context: Context?) {
        //super.onAttach(context)
        //if (context is OnVersionsFragmentInteractionListener) {
            //listener = context
        //} else {
         //   throw RuntimeException(context!!.toString() + " must implement OnVersionsFragmentInteractionListener")
        //}
    //}

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
    //interface OnVersionsFragmentInteractionListener {
        // TODO: Update argument type and name
        //fun onFragmentInteraction(uri: Uri)
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
         * @return A new instance of fragment VersionsFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(): VersionsFragment {
            //val args = Bundle()
            //args.putString(ARG_PARAM1, param1)
            //args.putString(ARG_PARAM2, param2)
            //fragment.arguments = args
            return VersionsFragment()
        }
    }
}
