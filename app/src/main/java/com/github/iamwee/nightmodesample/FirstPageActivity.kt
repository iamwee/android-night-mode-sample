package com.github.iamwee.nightmodesample


import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_page.*

class FirstPageActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        textViewContent.setOnClickListener {
            startActivity(Intent(this@FirstPageActivity, SecondPageActivity::class.java))
        }
    }
}
