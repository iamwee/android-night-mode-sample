package com.github.iamwee.nightmodesample

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate.*
import kotlinx.android.synthetic.main.activity_second_page.*

class SecondPageActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        switchDarkMode.isChecked = DayNightUtils.isNightMode
        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            DayNightUtils.isNightMode = isChecked

            val intent = Intent(this@SecondPageActivity, FirstPageActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> consume { finish() }
        else -> super.onOptionsItemSelected(item)
    }

}

fun consume(func: () -> Unit): Boolean {
    func()
    return true
}