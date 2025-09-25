package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment

class CafeDetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        private const val ARG_CONTENT = "content"

        fun newInstance(content: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putString(ARG_CONTENT, content)
            fragment.arguments = args
            return fragment
        }
    }
}
