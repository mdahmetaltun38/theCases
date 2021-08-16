package com.example.personelkaydet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_case.*
import kotlinx.android.synthetic.main.activity_q2.*

class q2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)

        setActionBar()

        val intent= intent
        var casename=intent.getStringExtra("putcasename")
        var maxScore= intent.getStringExtra("putmaxScore")
        var question2=intent.getStringExtra("putquestion2")
        var casebody = intent.getStringExtra("putcasebody")
        var option1q2 = intent.getStringExtra("putoption1q2")
        var option2q2 = intent.getStringExtra("putoption2q2")
        var option3q2 = intent.getStringExtra("putoption3q2")
        var option4q2 = intent.getStringExtra("putoption4q2")
        var option5q2 = intent.getStringExtra("putoption5q2")
        var option6q2 = intent.getStringExtra("putoption6q2")
        var score1q2 = intent.getStringExtra("putscore1q2")
        var score2q2 = intent.getStringExtra("putscore2q2")
        var score3q2 = intent.getStringExtra("putscore3q2")
        var score4q2 = intent.getStringExtra("putscore4q2")
        var score5q2 = intent.getStringExtra("putscore5q2")
        var score6q2 = intent.getStringExtra("putscore6q2")
        var maxScoreq2 = intent.getStringExtra("putmaxScoreq2")
        var question3= intent.getStringExtra("putquestion3")
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
        var maxScoreq3= intent.getStringExtra("putmaxScoreq3")
        var newsum= intent.getStringExtra("putnewsum")


        tv_case_name_listdisplayq2.text= casename.toString()
        tv_questionq2.text=question2.toString()
        case_body_display_screenq2.text = casebody.toString()
        display_option1q2.text = option1q2.toString()
        display_option2q2.text = option2q2.toString()
        display_option3q2.text = option3q2.toString()
        display_option4q2.text = option4q2.toString()
        display_option5q2.text = option5q2.toString()
        display_option6q2.text = option6q2.toString()


        button_scoreq2.setOnClickListener {

            var sum2 = 0

            if (display_option1q2.isChecked)
                sum2 += score1q2!!.toInt()
            if (display_option2q2.isChecked)
                sum2 += score2q2!!.toInt()
            if (display_option3q2.isChecked)
                sum2 += score3q2!!.toInt()
            if (display_option4q2.isChecked)
                sum2 += score4q2!!.toInt()
            if (display_option5q2.isChecked)
                sum2 += score5q2!!.toInt()
            if (display_option6q2.isChecked)
                sum2 += score6q2!!.toInt()



            display_scoreq2.text = sum2.toString()
            max_scoreq2.text = maxScoreq2.toString()

        }

        btn_next_q2.setOnClickListener {
            var sum2 = 0

            if (display_option1q2.isChecked)
                sum2 += score1q2!!.toInt()
            if (display_option2q2.isChecked)
                sum2 += score2q2!!.toInt()
            if (display_option3q2.isChecked)
                sum2 += score3q2!!.toInt()
            if (display_option4q2.isChecked)
                sum2 += score4q2!!.toInt()
            if (display_option5q2.isChecked)
                sum2 += score5q2!!.toInt()
            if (display_option6q2.isChecked)
                sum2 += score6q2!!.toInt()

            var newsum2=sum2.toString()

            var intent= Intent(this@q2Activity, q3Activity::class.java)

            intent.putExtra("putcasebody", casebody)
            intent.putExtra("putquestion3", question3)
            intent.putExtra("putcasename", casename)
            intent.putExtra("putoption1q3", option1q3)
            intent.putExtra("putoption2q3", option2q3)
            intent.putExtra("putoption3q3", option3q3)
            intent.putExtra("putoption4q3", option4q3)
            intent.putExtra("putoption5q3", option5q3)
            intent.putExtra("putoption6q3", option6q3)
            intent.putExtra("putscore1q3", score1q3)
            intent.putExtra("putscore2q3", score2q3)
            intent.putExtra("putscore3q3", score3q3)
            intent.putExtra("putscore4q3", score4q3)
            intent.putExtra("putscore5q3", score5q3)
            intent.putExtra("putscore6q3", score6q3)
            intent.putExtra("putmaxScore", maxScore)
            intent.putExtra("putmaxScoreq2", maxScoreq2)
            intent.putExtra("putmaxScoreq3", maxScoreq3)
            intent.putExtra("putnewsum", newsum)
            intent.putExtra("putnewsum2", newsum2)
            startActivity(intent)
        }




    }
    private fun setActionBar() {
        setSupportActionBar(toolbar_q2_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
            actionBar.title = "Second Case"
        }

        toolbar_q2_activity.setNavigationOnClickListener { onBackPressed() }
    }

}