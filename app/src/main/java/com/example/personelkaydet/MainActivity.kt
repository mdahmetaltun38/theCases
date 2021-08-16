package com.example.personelkaydet

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBar()
        var database= FirebaseDatabase.getInstance().reference

        sign_out.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            intent= Intent(this, IntroActivity::class.java)
            startActivity(intent)
        }

        btnekle.setOnClickListener {
            var casename= case_name.text.toString()
            var casebody= case_body.text.toString()
            var question1= tv_question1.text.toString()
            var option1= tv_option1.text.toString()
            var option2= tv_option2.text.toString()
            var option3= tv_option3.text.toString()
            var option4= tv_option4.text.toString()
            var option5= tv_option5.text.toString()
            var option6= tv_option6.text.toString()
            var score1= score_option1.text.toString()
            var score2= score_option2.text.toString()
            var score3= score_option3.text.toString()
            var score4= score_option4.text.toString()
            var score5= score_option5.text.toString()
            var score6= score_option6.text.toString()
            var maxScore= score_max.text.toString()
            var question2= tv_question2.text.toString()
            var option1q2= tv_option1q2.text.toString()
            var option2q2= tv_option2q2.text.toString()
            var option3q2= tv_option3q2.text.toString()
            var option4q2= tv_option4q2.text.toString()
            var option5q2= tv_option5q2.text.toString()
            var option6q2= tv_option6q2.text.toString()
            var score1q2= score_option1q2.text.toString()
            var score2q2= score_option2q2.text.toString()
            var score3q2= score_option3q2.text.toString()
            var score4q2= score_option4q2.text.toString()
            var score5q2= score_option5q2.text.toString()
            var score6q2= score_option6q2.text.toString()
            var maxScoreq2= score_maxq2.text.toString()
            var question3= tv_question3.text.toString()
            var option1q3= tv_option1q3.text.toString()
            var option2q3= tv_option2q3.text.toString()
            var option3q3= tv_option3q3.text.toString()
            var option4q3= tv_option4q3.text.toString()
            var option5q3= tv_option5q3.text.toString()
            var option6q3= tv_option6q3.text.toString()
            var score1q3= score_option1q3.text.toString()
            var score2q3= score_option2q3.text.toString()
            var score3q3= score_option3q3.text.toString()
            var score4q3= score_option4q3.text.toString()
            var score5q3= score_option5q3.text.toString()
            var score6q3= score_option6q3.text.toString()
            var maxScoreq3= score_maxq3.text.toString()




           if (TextUtils.isEmpty(casename)){
               case_name.error= "Lütfen Boş Bırakmayın"
           }

            if (TextUtils.isEmpty(casebody)){
                case_body.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(question1)){
                tv_question1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option1)){
                tv_option1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option2)){
                tv_option2.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option3)){
                tv_option3.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option4)){
                tv_option4.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option5)){
                tv_option5.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option6)){
                tv_option6.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score1)){
                score_option1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score2)){
                score_option2.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score3)){
                score_option3.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score4)){
                score_option4.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score5)){
                score_option5.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score6)){
                score_option6.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(maxScore)){
                score_max.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(question2)){
                tv_question1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option1q2)){
                tv_option1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option2q2)){
                tv_option2.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option3q2)){
                tv_option3.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option4q2)){
                tv_option4.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option5q2)){
                tv_option5.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option6q2)){
                tv_option6.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score1q2)){
                score_option1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score2q2)){
                score_option2.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score3q2)){
                score_option3.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score4q2)){
                score_option4.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score5q2)){
                score_option5.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score6q2)){
                score_option6.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(maxScoreq2)){
                score_max.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(question3)){
                tv_question1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option1q3)){
                tv_option1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option2q3)){
                tv_option2.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option3q3)){
                tv_option3.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option4q3)){
                tv_option4.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option5q3)){
                tv_option5.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(option6q3)){
                tv_option6.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score1q3)){
                score_option1.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score2q3)){
                score_option2.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score3q3)){
                score_option3.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score4q3)){
                score_option4.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score5q3)){
                score_option5.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(score6q3)){
                score_option6.error= "Lütfen Boş Bırakmayın"
            }
            if (TextUtils.isEmpty(maxScoreq3)){
                score_max.error= "Lütfen Boş Bırakmayın"
            }

            else{
                var database= FirebaseDatabase.getInstance()
                var databaseReference=database.reference.child("Cases")
                var id= databaseReference.push()

                id.child("id").setValue(id.key.toString())
                id.child("casename").setValue(casename)
                id.child("casebody").setValue(casebody)
                id.child("question1").setValue(question1)
                id.child("option1").setValue(option1)
                id.child("option2").setValue(option2)
                id.child("option3").setValue(option3)
                id.child("option4").setValue(option4)
                id.child("option5").setValue(option5)
                id.child("option6").setValue(option6)
                id.child("score1").setValue(score1)
                id.child("score2").setValue(score2)
                id.child("score3").setValue(score3)
                id.child("score4").setValue(score4)
                id.child("score5").setValue(score5)
                id.child("score6").setValue(score6)
                id.child("maxScore").setValue(maxScore)
                id.child("question2").setValue(question2)
                id.child("option1q2").setValue(option1q2)
                id.child("option2q2").setValue(option2q2)
                id.child("option3q2").setValue(option3q2)
                id.child("option4q2").setValue(option4q2)
                id.child("option5q2").setValue(option5q2)
                id.child("option6q2").setValue(option6q2)
                id.child("score1q2").setValue(score1q2)
                id.child("score2q2").setValue(score2q2)
                id.child("score3q2").setValue(score3q2)
                id.child("score4q2").setValue(score4q2)
                id.child("score5q2").setValue(score5q2)
                id.child("score6q2").setValue(score6q2)
                id.child("maxScoreq2").setValue(maxScoreq2)
                id.child("question3").setValue(question3)
                id.child("option1q3").setValue(option1q3)
                id.child("option2q3").setValue(option2q3)
                id.child("option3q3").setValue(option3q3)
                id.child("option4q3").setValue(option4q3)
                id.child("option5q3").setValue(option5q3)
                id.child("option6q3").setValue(option6q3)
                id.child("score1q3").setValue(score1q3)
                id.child("score2q3").setValue(score2q3)
                id.child("score3q3").setValue(score3q3)
                id.child("score4q3").setValue(score4q3)
                id.child("score5q3").setValue(score5q3)
                id.child("score6q3").setValue(score6q3)
                id.child("maxScoreq3").setValue(maxScoreq3)


                Toast.makeText(applicationContext, "Kayıt Başarılı", Toast.LENGTH_LONG).show()
                val intent= Intent(this, CaseListDisplayActivity::class.java)
                startActivity(intent)
                finish()

            }
        }

        button_show_caselist.setOnClickListener {
            val intent=Intent(this, CaseListDisplayActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun setupActionBar() {
        setSupportActionBar(toolbar_main_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
            actionBar.title = "Enter A Case"
        }

        toolbar_main_activity.setNavigationOnClickListener { onBackPressed() }
    }
}