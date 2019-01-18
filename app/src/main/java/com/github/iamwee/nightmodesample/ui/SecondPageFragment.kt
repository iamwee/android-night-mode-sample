package com.github.iamwee.nightmodesample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.iamwee.nightmodesample.R
import com.github.iamwee.nightmodesample.utils.DayNightUtils
import com.github.iamwee.nightmodesample.utils.delegate
import kotlinx.android.synthetic.main.fragment_second_page.*

class SecondPageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_second_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        switchDarkMode.isChecked = DayNightUtils.isNightMode
        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            DayNightUtils.isNightMode = isChecked
            delegate<Delegate>()?.onNightModeSwitched()
        }
    }

    interface Delegate {
        fun onNightModeSwitched()
    }

}
