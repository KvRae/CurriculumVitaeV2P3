package com.example.curriculumvitaev2.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import com.example.curriculumvitaev2.R

class HobbiesFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_hobbies, container, false)
        val bundle =this.arguments


        val movies = bundle?.getBoolean("moviesSkills" ,false)
        val sport = bundle?.getBoolean("sportsSkills" ,false)
        val games = bundle?.getBoolean("gamesSkills" ,false)

        val moviesSkills = view.findViewById<CheckBox>(R.id.checkBox4)
        val sportsSkills = view.findViewById<CheckBox>(R.id.checkBox5)
        val gamesSkills = view.findViewById<CheckBox>(R.id.checkBox6)


        if (movies != null) {
            moviesSkills.isChecked = movies
        }
        if (sport != null) {
            sportsSkills.isChecked = sport
        }
        if (games != null) {
            gamesSkills.isChecked = games
        }

        return view


    }


}