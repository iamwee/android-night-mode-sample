package com.github.iamwee.nightmodesample.ui


import android.content.Intent
import android.os.Bundle
import com.github.iamwee.nightmodesample.BaseActivity
import com.github.iamwee.nightmodesample.R
import com.github.iamwee.nightmodesample.utils.inTransaction

class FirstPageActivity : BaseActivity(), FirstPageFragment.Delegate {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.partial_fragment_container)

        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(R.id.fragmentContainer, FirstPageFragment())
            }
        }
    }

    override fun onContentClicked() {
        startActivity(Intent(this@FirstPageActivity, SecondPageActivity::class.java))
    }
}
