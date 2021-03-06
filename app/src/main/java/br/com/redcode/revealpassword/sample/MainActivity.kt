package br.com.redcode.revealpassword.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.redcode.revealpassword.library.showOrHidePassword
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextWithImageForRevealPassword.changeIcon(android.R.drawable.ic_delete)

        editTextWithImageForRevealPassword.changeHint(getString(R.string.app_name))

        buttonShowHidePassword.setOnClickListener { editTextSampleFunction.showOrHidePassword() }
    }
}
