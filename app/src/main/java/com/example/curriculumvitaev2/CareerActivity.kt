package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculumvitaev2.fragments.EducationFragment
import com.example.curriculumvitaev2.fragments.ExperienceFragment

class CareerActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)

        val btnEducation = findViewById<Button>(R.id.btn_education)
        val btnExperience = findViewById<Button>(R.id.btn_experience)

        btnEducation.setOnClickListener {
            val fragment = EducationFragment()
            showFragment(fragment)
        }

        btnExperience.setOnClickListener {
            val fragment = ExperienceFragment()
            showFragment(fragment)

        }

    }
    fun showFragment(fragment: Fragment) {
        val fram = supportFragmentManager.beginTransaction()
        fram.replace(R.id.fragmentContainerView, fragment)
        fram.commit()
    }
}


