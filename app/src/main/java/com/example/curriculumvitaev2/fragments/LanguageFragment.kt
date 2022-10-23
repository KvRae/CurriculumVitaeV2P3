package com.example.curriculumvitaev2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.SeekBar
import com.example.curriculumvitaev2.R

class LanguageFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_language, container, false)
        val bundle =this.arguments


        val arabic = bundle?.getBoolean("arabicSkills" ,false)
        val french = bundle?.getBoolean("frenchSkills" ,false)
        val english = bundle?.getBoolean("englishSkills" ,false)


        val arabicSkills = view.findViewById<CheckBox>(R.id.checkBox)
        val englishSkills = view.findViewById<CheckBox>(R.id.checkBox3)
        val frenchSkills = view.findViewById<CheckBox>(R.id.checkBox2)

        arabicSkills.isChecked = arabic!!
        englishSkills.isChecked = french!!
        frenchSkills.isChecked = english!!


        //arabicSkills.progress=ios!!.toInt()
        //englishSkills.progress=flutter!!.toInt()
       // frenchSkills=french.

        return view
    }


}