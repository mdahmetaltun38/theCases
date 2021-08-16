package com.example.personelkaydet

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_q3.*
import kotlinx.android.synthetic.main.activity_result.*
import java.io.File

class ResultActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setActionBar()



        val intent = intent
        var newsum = intent.getStringExtra("putnewsum")
        var newsum2 = intent.getStringExtra("putnewsum2")
        var newsum3 = intent.getStringExtra("putnewsum3")
        var casename = intent.getStringExtra("putcasename")
        var maxScore = intent.getStringExtra("putmaxScore")
        var maxScoreq2 = intent.getStringExtra("putmaxScoreq2")
        var maxScoreq3 = intent.getStringExtra("putmaxScoreq3")




            if (newsum!!.toInt() >= (maxScore!!.toInt() * 0.9)){

                commentq1.text= "You are awesome. Almost there...Keep up the good work"

             }else if (newsum!!.toInt() <= (maxScore!!.toInt() * 0.59)){

            commentq1.text= "bad bad. You have to start over from scractch"
                }else{
                commentq1.text= "not so bad. Keep pushing. You will get there"
                 }


        if (newsum2!!.toInt() >= (maxScoreq2!!.toInt() * 0.9)){

            commentq2.text= "You are awesome. Almost there...Keep up the good work"

        }else if (newsum2!!.toInt() <= (maxScoreq2!!.toInt() * 0.59)){

            commentq2.text= "bad bad. You have to start over from scractch"
        }else{
            commentq2.text= "not so bad. Keep pushing. You will get there"
        }

        if (newsum3!!.toInt() >= (maxScoreq3!!.toInt() * 0.9)){

            commentq3.text= "You are awesome. Almost there...Keep up the good work"

        }else if (newsum3!!.toInt() <= (maxScoreq3!!.toInt() * 0.59)){

            commentq3.text= "bad bad. You have to start over from scractch"
        }else{
            commentq3.text= "not so bad. Keep pushing. You will get there"
        }




        tv_casename_result.text = casename.toString()
        tv_sumq1_result.text = newsum.toString()
        tv_sumq2_result.text = newsum2.toString()
        tv_sumq3_result.text = newsum3.toString()
        tv_maxScoreq1.text = maxScore.toString()
        tv_maxScoreq2.text = maxScoreq2.toString()
        tv_maxScoreq3.text = maxScoreq3.toString()


    }
    private fun setActionBar() {
        setSupportActionBar(toolbar_result_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
            actionBar.title = "Results"
        }

        toolbar_result_activity.setNavigationOnClickListener { onBackPressed() }
    }
}