package com.example.secondmorningfirefoxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Instantiate the UI elements
    var buttonRegister: Button? = null
    var buttonLogin: Button? = null
    var myImgPhoto: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reference the elements using their respective IDs
        buttonRegister = findViewById(R.id.mBtnRegister)
        buttonLogin = findViewById(R.id.mBtnLogin)
        myImgPhoto = findViewById(R.id.mImgPhoto)

        //Set listeners to the elements
        buttonRegister!!.setOnClickListener {
            Toast.makeText(
                applicationContext, "Register button clicked",
                Toast.LENGTH_LONG
            ).show()
        }
        buttonLogin!!.setOnClickListener {
            Toast.makeText(
                applicationContext, "Login button clicked",
                Toast.LENGTH_LONG
            ).show()
        }
        myImgPhoto!!.setOnClickListener {
            Toast.makeText(
                applicationContext, "Image photo clicked",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}