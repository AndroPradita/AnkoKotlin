package com.ghozay19.ankokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnKlik.setText("Coba Klik")

        btnKlik.onClick {
            tv1.setText("Ini Pakai Anko lho")
            toast("Text Berubah kan...")
        }

        sms.onClick {
            sendSMS("089699993199", "halo gan")
        }

        telpon.onClick{
           makeCall("089699993199")
        }

        email.onClick {
            email("ghozymustofa28@gmail.com","Test Anko Kotlin","ini coba project pakai Kotlin ANKO")
        }

        pindah.onClick {
            startActivity(intentFor<Main2Activity>())
        }

    }
}
