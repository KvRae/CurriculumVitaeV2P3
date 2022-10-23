package com.example.curriculumvitaev2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var iosText : Int
        val submit = findViewById<Button>(R.id.submit)
        val seekIos = findViewById<SeekBar>(R.id.ios_seek)
        val seekFlutter = findViewById<SeekBar>(R.id.flutter_seek)
        val seekAndroid = findViewById<SeekBar>(R.id.android_seek)
        val arabicSkills = findViewById<CheckBox>(R.id.checkBox)
        val frenchSkills = findViewById<CheckBox>(R.id.checkBox2)
        val englishSkills = findViewById<CheckBox>(R.id.checkBox3)
        val moviesSkills = findViewById<CheckBox>(R.id.checkBox4)
        val sportsSkills = findViewById<CheckBox>(R.id.checkBox5)
        val gamesSkills = findViewById<CheckBox>(R.id.checkBox6)

        seekIos?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekIos: SeekBar,
                                           progress: Int, fromUser: Boolean) {

            }

            override fun onStartTrackingTouch(seekIos: SeekBar) {

            }

            override fun onStopTrackingTouch(seekIos: SeekBar) {

            }
        })

        seekFlutter?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekFlutter: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                // write custom code for progress is changed
            }

            override fun onStartTrackingTouch(seekFlutter: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(seekFlutter: SeekBar) {
                // write custom code for progress is stopped

            }
        })

        seekAndroid?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekAndroid: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                // write custom code for progress is changed
            }

            override fun onStartTrackingTouch(seekAndroid: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(seekAndroid: SeekBar) {
                // write custom code for progress is stopped

            }
        })
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val gender = intent.getStringExtra("gender")
        intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("name",name)
        intent.putExtra("email",email)
        intent.putExtra("age",age)
        intent.putExtra("gender",gender)
        submit.setOnClickListener {
            intent.putExtra("iosSkills",seekIos.progress.toString())
            intent.putExtra("flutterSkills",seekFlutter.progress.toString())
            intent.putExtra("androidSkills",seekAndroid.progress.toString())

            if(arabicSkills.isChecked()){
                intent.putExtra("arabicSkills",arabicSkills.isChecked());
            }
            if(frenchSkills.isChecked()){
                intent.putExtra("frenchSkills",frenchSkills.isChecked());
            }
            if(englishSkills.isChecked()){
                intent.putExtra("englishSkills",englishSkills.isChecked());
            }

           if(moviesSkills.isChecked()){
                intent.putExtra("moviesSkills",moviesSkills.isChecked());
            }
            if(sportsSkills.isChecked()){
                intent.putExtra("sportsSkills",sportsSkills.isChecked());
            }
            if(gamesSkills.isChecked()){
                intent.putExtra("gamesSkills",gamesSkills.isChecked());
            }
            startActivity(intent)
        }
    }
}