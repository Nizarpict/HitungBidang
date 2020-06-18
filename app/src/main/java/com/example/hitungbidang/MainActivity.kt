package com.example.hitungbidang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // aksi ketika button diklik
        btn_Persegi.setOnClickListener(this)
        btn_PersegiPanjang.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // identifikasi button yang diklik
        when (v.id) {
            R.id.btn_Persegi -> {
                //ketika button menu 1 diklik maka akan pindah dari main ke persegi
                startActivity(Intent(this@MainActivity, PersegiActivity::class.java))
            }
            R.id.btn_PersegiPanjang -> {
                //aksi ketika button menu 2 diklik
                startActivity(Intent(this@MainActivity, PersegiPanjangActivity::class.java))
            }
        }

    }
}