package com.github.iamwee.nightmodesample.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import com.github.iamwee.nightmodesample.BaseActivity
import com.github.iamwee.nightmodesample.R
import com.github.iamwee.nightmodesample.utils.consume
import com.github.iamwee.nightmodesample.utils.inTransaction

class SecondPageActivity : BaseActivity(),
    SecondPageFragment.Delegate {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.partial_fragment_container)

        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(
                    R.id.fragmentContainer,
                    SecondPageFragment()
                )
            }
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onNightModeSwitched() {
        val intent = Intent(this@SecondPageActivity, FirstPageActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> consume { finish() }
        else -> super.onOptionsItemSelected(item)
    }

}