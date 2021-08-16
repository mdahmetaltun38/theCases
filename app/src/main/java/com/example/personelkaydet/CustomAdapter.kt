package com.example.personelkaydet

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val caseList: ArrayList<Case>, private val context: Context) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv_case_name_listdisplay: TextView= view.findViewById(R.id.tv_case_name_listdisplay)

    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.case_item_list, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.tv_case_name_listdisplay.text= caseList[position].casename





        viewHolder.itemView.setOnClickListener {
            //Seçili Pozisyonu almak

            var case= caseList[position]
            var casename:String?= case.casename
            var casebody:String?= case.casebody
            var question1:String?=case.question1
            var option1:String?=case.option1
            var option2:String?=case.option2
            var option3:String?=case.option3
            var option4:String?=case.option4
            var option5:String?=case.option5
            var option6:String?=case.option6
            var score1:String?=case.score1
            var score2:String?=case.score2
            var score3:String?=case.score3
            var score4:String?=case.score4
            var score5:String?=case.score5
            var score6:String?=case.score6
            var maxScore:String?=case.maxScore
            var caseId:String?= case.id
            var question2:String?=case.question2
            var option1q2:String?=case.option1q2
            var option2q2:String?=case.option2q2
            var option3q2:String?=case.option3q2
            var option4q2:String?=case.option4q2
            var option5q2:String?=case.option5q2
            var option6q2:String?=case.option6q2
            var score1q2:String?=case.score1q2
            var score2q2:String?=case.score2q2
            var score3q2:String?=case.score3q2
            var score4q2:String?=case.score4q2
            var score5q2:String?=case.score5q2
            var score6q2:String?=case.score6q2
            var maxScoreq2:String?=case.maxScoreq2
            var question3:String?=case.question3
            var option1q3:String?=case.option1q3
            var option2q3:String?=case.option2q3
            var option3q3:String?=case.option3q3
            var option4q3:String?=case.option4q3
            var option5q3:String?=case.option5q3
            var option6q3:String?=case.option6q3
            var score1q3:String?=case.score1q3
            var score2q3:String?=case.score2q3
            var score3q3:String?=case.score3q3
            var score4q3:String?=case.score4q3
            var score5q3:String?=case.score5q3
            var score6q3:String?=case.score6q3
            var maxScoreq3:String?=case.maxScoreq3






            var intent= Intent(context, DisplayCaseActivity::class.java)
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
            //activity sayfasını başlat
            context.startActivity(intent)




        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = caseList.size

}