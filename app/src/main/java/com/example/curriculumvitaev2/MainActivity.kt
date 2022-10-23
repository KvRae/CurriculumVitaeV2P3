package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.RadioGroup

import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.next)
        val name = findViewById<TextInputLayout>(R.id.fullname)
        val email = findViewById<TextInputLayout>(R.id.email)
        val age = findViewById<TextInputLayout>(R.id.age)
        val radioGroup = findViewById<RadioGroup>(R.id.genderG)




        button.setOnClickListener {
            intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("gender",resources.getResourceEntryName(radioGroup.checkedRadioButtonId).toString())
            val selectedRadio = radioGroup.checkedRadioButtonId
            val colorString = resources.getResourceEntryName(selectedRadio)
            val textFields = arrayOf<TextInputLayout>(name, email, age)
            name.error = null
            email.error = null
            age.error = null

            if (name.editText?.text.toString() == "" || email.editText?.text.toString() == "" || age.editText?.text.toString() == ""){
                for (i in textFields.indices)
                {
                    if (textFields[i].editText?.text.toString() == ""){
                        textFields[i].error = getString(R.string.emptyField)
                    }
                }

            }else{
                if(!(Patterns.EMAIL_ADDRESS.matcher(email.editText?.text.toString()).matches())){
                    email.error = getString(R.string.emailError)
                }else{
                    intent.putExtra("name",name.editText?.text.toString())
                    intent.putExtra("email",email.editText?.text.toString())
                    intent.putExtra("age",age.editText?.text.toString())
                    startActivity(intent)
                }

            }
        }






    }
}