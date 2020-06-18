package com.example.hitungbidang

import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_persegi.*

class PersegiActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)


        btn_count.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        if (v.id == R.id.btn_count) {


            val length = et_length.text.toString().trim()
            val width = et_width.text.toString().trim()


            if (length.isEmpty()) {
                et_length.setError("Panjang tidak boleh kosong")
            } else if (width.isEmpty()) {
                et_width.setError("Lebar tidak boleh kosong")
            }

            else {

                val countLuas = length.toDouble() * width.toDouble()
                val countKeliling = 2 * (length.toDouble() + width.toDouble())


                tv_result_1.setText(countLuas.toString())
                tv_result_2.setText(countKeliling.toString())
            }
        }
    }
}