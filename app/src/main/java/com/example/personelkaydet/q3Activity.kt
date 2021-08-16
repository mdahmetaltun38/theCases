package com.example.personelkaydet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_q2.*
import kotlinx.android.synthetic.main.activity_q3.*

class q3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q3)


        setActionBar()

        val intent= intent
        var question3 = intent.getStringExtra("putquestion3")
        var casename= intent.getStringExtra("putcasename")
        var casebody= intent.getStringExtra("putcasebody")
        var option1q3= intent.getStringExtra("putoption1q3")
        var option2q3= intent.getStringExtra("putoption2q3")
        var option3q3= intent.getStringExtra("putoption3q3")
        var option4q3= intent.getStringExtra("putoption4q3")
        var option5q3= intent.getStringExtra("putoption5q3")
        var option6q3= intent.getStringExtra("putoption6q3")
        var score1q3= intent.getStringExtra("putscore1q3")
        var score2q3= intent.getStringExtra("putscore2q3")
        var score3q3= intent.getStringExtra("putscore3q3")
        var score4q3= intent.getStringExtra("putscore4q3")
        var score5q3= intent.getStringExtra("putscore5q3")
        var score6q3= intent.getStringExtra("putscore6q3")
        var maxScore= intent.getStringExtra("putmaxScore")
        var maxScoreq2= intent.getStringExtra("putmaxScoreq2")
        var maxScoreq3= intent.getStringExtra("putmaxScoreq3")
        var newsum= intent.getStringExtra("putnewsum")
        var newsum2= intent.getStringExtra("putnewsum2")

        tv_questionq3.text=question3.toString()
        tv_case_name_listdisplayq3.text=casename.toString()
        case_body_display_screenq3.text=casebody.toString()
        display_option1q3.text= option1q3.toString()
        display_option2q3.text= option2q3.toString()
        display_option3q3.text= option3q3.toString()
        display_option4q3.text= option4q3.toString()
        display_option5q3.text= option5q3.toString()
        display_option6q3.text= option6q3.toString()


        button_scoreq3.setOnClickListener {

            var sum3 = 0

            if (display_option1q3.isChecked)
                sum3 += score1q3!!.toInt()
            if (display_option2q3.isChecked)
                sum3 += score2q3!!.toInt()
            if (display_option3q3.isChecked)
                sum3 += score3q3!!.toInt()
            if (display_option4q3.isChecked)
                sum3 += score4q3!!.toInt()
            if (display_option5q3.isChecked)
                sum3 += score5q3!!.toInt()
            if (display_option6q3.isChecked)
                sum3 += score6q3!!.toInt()



            display_scoreq3.text = sum3.toString()
            max_scoreq3.text = maxScoreq3.toString()

        }

        btn_next_q3.setOnClickListener {


            var sum3 = 0

            if (display_option1q3.isChecked)
                sum3 += score1q3!!.toInt()
            if (display_option2q3.isChecked)
                sum3 += score2q3!!.toInt()
            if (display_option3q3.isChecked)
                sum3 += score3q3!!.toInt()
            if (display_option4q3.isChecked)
                sum3 += score4q3!!.toInt()
            if (display_option5q3.isChecked)
                sum3 += score5q3!!.toInt()
            if (display_option6q3.isChecked)
                sum3 += score6q3!!.toInt()

            var newsum3= sum3.toString()

            var intent= Intent(this@q3Activity, ResultActivity::class.java)
            intent.putExtra("putcasename", casename)
            intent.putExtra("putnewsum", newsum)
            intent.putExtra("putnewsum2", newsum2)
            intent.putExtra("putnewsum3", newsum3)
            intent.putExtra("putmaxScore", maxScore)
            intent.putExtra("putmaxScoreq2", maxScoreq2)
            intent.putExtra("putmaxScoreq3", maxScoreq3)
            startActivity(intent)
        }

    }


    private fun setActionBar() {
        setSupportActionBar(toolbar_q3_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
            actionBar.title = "Third Case"
        }

        toolbar_q3_activity.setNavigationOnClickListener { onBackPressed() }
    }
}