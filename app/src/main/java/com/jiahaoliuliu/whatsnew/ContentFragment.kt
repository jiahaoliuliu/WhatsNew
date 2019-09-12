package com.jiahaoliuliu.whatsnew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM_IMAGE_ID = "imageId"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ContentFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ContentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContentFragment : Fragment() {
    private var imageId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageId = it.getInt(ARG_PARAM_IMAGE_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_content, container, false)
        view.findViewById<ImageView>(R.id.content_image).setImageDrawable(activity?.resources?.getDrawable(imageId))
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @return A new instance of fragment ContentFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(paramImageId: Int) =
            ContentFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM_IMAGE_ID, paramImageId)
                }
            }
    }
}
