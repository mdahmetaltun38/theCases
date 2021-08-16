package com.example.personelkaydet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import io.grpc.InternalChannelz.id
import kotlinx.android.synthetic.main.activity_case_list_display.*
import kotlinx.android.synthetic.main.activity_display_case.*

class DisplayCaseActivity : BaseActivity() {
    private lateinit var dbref: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_case)

        setActionBar()

        val intent = intent
        var caseId= intent.getStringExtra("putcaseId")
        var casename= intent.getStringExtra("putcasename")
        var casebody = intent.getStringExtra("putcasebody")
        var question1 = intent.getStringExtra("putquestion1")
        var option1 = intent.getStringExtra("putoption1")
        var option2 = intent.getStringExtra("putoption2")
        var option3 = intent.getStringExtra("putoption3")
        var option4 = intent.getStringExtra("putoption4")
        var option5 = intent.getStringExtra("putoption5")
        var option6 = intent.getStringExtra("putoption6")
        var score1 = intent.getStringExtra("putscore1")
        var score2 = intent.getStringExtra("putscore2")
        var score3 = intent.getStringExtra("putscore3")
        var score4 = intent.getStringExtra("putscore4")
        var score5 = intent.getStringExtra("putscore5")
        var score6 = intent.getStringExtra("putscore6")
        var maxScore = intent.getStringExtra("putmaxScore")
        var question2 = intent.getStringExtra("putquestion2")
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


        //tasarım sayfasındaki elemanlara aktarma

        case_body_display_screen.text = casebody.toString()
        tv_case_name_listdisplay.text= casename.toString()
        tv_question.text = question1.toString()
        display_option1.text = option1.toString()
        display_option2.text = option2.toString()
        display_option3.text = option3.toString()
        display_option4.text = option4.toString()
        display_option5.text = option5.toString()
        display_option6.text = option6.toString()







        button_score.setOnClickListener {

            var sum = 0

            if (display_option1.isChecked)
                sum += score1!!.toInt()
            if (display_option2.isChecked)
                sum += score2!!.toInt()
            if (display_option3.isChecked)
                sum += score3!!.toInt()
            if (display_option4.isChecked)
                sum += score4!!.toInt()
            if (display_option5.isChecked)
                sum += score5!!.toInt()
            if (display_option6.isChecked)
                sum += score6!!.toInt()



            display_score.text = sum.toString()
            max_score.text = maxScore.toString()

            var currentUser = FirebaseAuth.getInstance().currentUser!!.uid



            var database = FirebaseDatabase.getInstance()
            var databaseReference = database.reference.child("Scores")

            var id = databaseReference.child(caseId.toString()).child(currentUser)

            id.child("id").setValue(id.key.toString())
            id.child("caseId").setValue(caseId)
            id.child("currentUser").setValue(currentUser)
            id.child("sum").setValue(sum)



        }




        btn_next.setOnClickListener {

            var sum = 0

            if (display_option1.isChecked)
                sum += score1!!.toInt()
            if (display_option2.isChecked)
                sum += score2!!.toInt()
            if (display_option3.isChecked)
                sum += score3!!.toInt()
            if (display_option4.isChecked)
                sum += score4!!.toInt()
            if (display_option5.isChecked)
                sum += score5!!.toInt()
            if (display_option6.isChecked)
                sum += score6!!.toInt()

            var newsum=sum.toString()

            var intent= Intent(this@DisplayCaseActivity, q2Activity::class.java)
            intent.putExtra("putcasename", casename)
            intent.putExtra("putcasebody", casebody)
            intent.putExtra("putquestion1", question1)
            intent.putExtra("putoption1", option1)
            intent.putExtra("putoption2", option2)
            intent.putExtra("putoption3", option3)
            intent.putExtra("putoption4", option4)
            intent.putExtra("putoption5", option5)
            intent.putExtra("putoption6", option6)
            intent.putExtra("putscore1", score1)
            intent.putExtra("putscore2", score2)
            intent.putExtra("putscore3", score3)
            intent.putExtra("putscore4", score4)
            intent.putExtra("putscore5", score5)
            intent.putExtra("putscore6", score6)
            intent.putExtra("putmaxScore", maxScore)
            intent.putExtra("putcaseId", caseId)
            intent.putExtra("putquestion2", question2)
            intent.putExtra("putoption1q2", option1q2)
            intent.putExtra("putoption2q2", option2q2)
            intent.putExtra("putoption3q2", option3q2)
            intent.putExtra("putoption4q2", option4q2)
            intent.putExtra("putoption5q2", option5q2)
            intent.putExtra("putoption6q2", option6q2)
            intent.putExtra("putscore1q2", score1q2)
            intent.putExtra("putscore2q2", score2q2)
            intent.putExtra("putscore3q2", score3q2)
            intent.putExtra("putscore4q2", score4q2)
            intent.putExtra("putscore5q2", score5q2)
            intent.putExtra("putscore6q2", score6q2)
            intent.putExtra("putmaxScoreq2", maxScoreq2)
            intent.putExtra("putquestion3", question3)
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
            intent.putExtra("putmaxScoreq3", maxScoreq3)
            intent.putExtra("putnewsum", newsum)
            //activity sayfasını başlat
            startActivity(intent)




        }
    }


    private fun setActionBar() {
        setSupportActionBar(toolbar_display_case_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
            actionBar.title = "First Case"
        }

        toolbar_display_case_activity.setNavigationOnClickListener { onBackPressed() }
    }

}


