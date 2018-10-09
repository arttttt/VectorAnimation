package com.arttttt.vectoranim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vector.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                vector.switchProfile()
            }
        })
    }
}
