package com.example.curriculumvitaev2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.curriculumvitaev2.fragments.HobbiesFragment
import com.example.curriculumvitaev2.fragments.LanguageFragment
import com.example.curriculumvitaev2.fragments.SkillsFragment

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val gender = intent.getStringExtra("gender")
        val iosSkills = intent.getIntExtra("iosSkills",0)
        val flutterSkills = intent.getIntExtra("flutterSkills",0)
        val androidSkills = intent.getIntExtra("androidSkills",0)
        val arabicSkills = intent.getBooleanExtra("arabicSkills",false)
        val englishSkills = intent.getBooleanExtra("englishSkills",false)
        val frenchSkills = intent.getBooleanExtra("frenchSkills",false)
        val moviesSkills = intent.getBooleanExtra("moviesSkills",false)
        val sportsSkills = intent.getBooleanExtra("sportsSkills",false)
        val gamesSkills = intent.getBooleanExtra("gamesSkills",false)
        val bundle = Bundle()
        val btnSkills = findViewById<Button>(R.id.btn_skills)
        val btnHobbies = findViewById<Button>(R.id.btn_hobbies)
        val btnLanguage = findViewById<Button>(R.id.btn_language)
        val nameR = findViewById<TextView>(R.id.name_textview)
        val emailR = findViewById<TextView>(R.id.email_textview)
        val btnMyCareer = findViewById<Button>(R.id.career_btn)
        nameR.text = name
        emailR.text = email

        btnSkills.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("ios",iosSkills)
            bundle.putInt("android",androidSkills)
            bundle.putInt("flutter",flutterSkills)

            val fragment = SkillsFragment()
            fragment.setArguments(bundle)
            showFragment(fragment)
        }
        btnHobbies.setOnClickListener {
            bundle.putBoolean("moviesSkills",moviesSkills)
            bundle.putBoolean("sportsSkills",sportsSkills)
            bundle.putBoolean("gamesSkills",gamesSkills)
            val fragment = HobbiesFragment()
            fragment.setArguments(bundle)
            showFragment(fragment)

        }
        btnLanguage.setOnClickListener {

            bundle.putBoolean("arabicSkills",arabicSkills)
            bundle.putBoolean("frenchSkills",frenchSkills)
            bundle.putBoolean("englishSkills",englishSkills)


            val fragment = LanguageFragment()
            fragment.setArguments(bundle)
            showFragment(fragment)
        }

        btnMyCareer.setOnClickListener {
            intent = Intent(this,CareerActivity::class.java)
            startActivity(intent)
        }
    }
    fun showFragment(fragment: Fragment){
        val fram = supportFragmentManager.beginTransaction()
        fram.replace(R.id.fragmentContainerView2,fragment)
        fram.commit()
    }
}