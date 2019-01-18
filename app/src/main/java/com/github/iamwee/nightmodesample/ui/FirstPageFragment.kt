package com.github.iamwee.nightmodesample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.iamwee.nightmodesample.R
import com.github.iamwee.nightmodesample.utils.delegate
import kotlinx.android.synthetic.main.fragment_first_page.*

class FirstPageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewContent.setOnClickListener { delegate<Delegate>()?.onContentClicked() }
    }

    interface Delegate {
        fun onContentClicked()
    }
}
