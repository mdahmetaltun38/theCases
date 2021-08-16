package com.example.personelkaydet

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_case_list_display.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList

class CaseListDisplayActivity : BaseActivity() {

    private lateinit var dbref: DatabaseReference
    private lateinit var caseRecyclerView: RecyclerView
    private lateinit var caseArrayList: ArrayList<Case>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_case_list_display)

        setActionBar()
        getCaseData()
        caseRecyclerView = case_recycle_list
        caseRecyclerView.layoutManager = LinearLayoutManager(this)
        caseRecyclerView.setHasFixedSize(true)
        caseArrayList = arrayListOf<Case>()





        button_addcase.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }

    private fun setActionBar() {
        setSupportActionBar(toolbar_case_list_display_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_white_color_back_24dp)
            actionBar.title = "Case List"
        }

        toolbar_case_list_display_activity.setNavigationOnClickListener { onBackPressed() }
    }

    private fun getCaseData() {
        dbref = FirebaseDatabase.getInstance().getReference("Cases")
        dbref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    for (caseSnapshot in snapshot.children) {
                        val case = caseSnapshot.getValue(Case::class.java)
                        caseArrayList.add(case!!)
                    }
                    caseRecyclerView.adapter = CustomAdapter(caseArrayList, this@CaseListDisplayActivity)

                }


            }

            override fun onCancelled(error: DatabaseError) {
                
            }
        })
    }

}
