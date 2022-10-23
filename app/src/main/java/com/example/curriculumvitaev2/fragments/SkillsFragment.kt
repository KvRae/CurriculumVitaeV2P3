package com.example.curriculumvitaev2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import com.example.curriculumvitaev2.R

class SkillsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_skills, container, false)

        val bundle =this.arguments


        val android = bundle?.getInt("android" , 0)
        val ios = bundle?.getInt("ios" , 0)
        val flutter = bundle?.getInt("flutter" , 0)

        val seekAndroid = view.findViewById<SeekBar>(R.id.android_seek)
        val seekFlutter = view.findViewById<SeekBar>(R.id.flutter_seek)
        val seekIos = view.findViewById<SeekBar>(R.id.ios_seek)

        seekIos.progress=ios!!.toInt()
        seekFlutter.progress=flutter!!.toInt()
        seekAndroid.progress=android!!.toInt()

        return view

    }


}