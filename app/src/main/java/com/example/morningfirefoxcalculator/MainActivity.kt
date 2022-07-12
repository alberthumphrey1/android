package com.example.morningfirefoxcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var myAnswer:TextView ?= null
    var myFnum:EditText ?= null
    var mySnum:EditText ?= null
    var buttonAdd:Button ?= null
    var buttonSubtract:Button ?= null
    var buttonDivide:Button ?= null
    var buttonMultiply:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAnswer = findViewById(R.id.mTvAnswer)
        myFnum = findViewById(R.id.mEditFnum)
        mySnum = findViewById(R.id.mEditSnum)
        buttonAdd = findViewById(R.id.mBtnAdd)
        buttonSubtract = findViewById(R.id.mBtnSubtract)
        buttonDivide = findViewById(R.id.mBtnDivide)
        buttonMultiply = findViewById(R.id.mBtnMultiply)

        //set onClick listeners to button
        buttonAdd!!.setOnClickListener {
            //Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()

            //Check if the user is submitting empty fields
            if (firstNumber.isEmpty()) {
                //Set an error to the firstNumber edit text
                myFnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                //set an error to the secondNumber
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else {
                //Proceed to calculate the two numbers
                var answer = firstNumber.toDouble() + secondNumber.toDouble()
                //Display the result of the text view myAnser
                myAnswer!!.text = answer.toString()
            }
        }
        buttonSubtract!!.setOnClickListener{
            //Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()

            //Check if the user is submitting empty fields
            if (firstNumber.isEmpty()) {
                //Set an error to the firstNumber edit text
                myFnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                //set an error to the secondNumber
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else {
                //Proceed to calculate the two numbers
                var answer = firstNumber.toDouble() - secondNumber.toDouble()
                //Display the result of the text view myAnser
                myAnswer!!.text = answer.toString()
            }
        }
        buttonDivide!!.setOnClickListener{
            //Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()

            //Check if the user is submitting empty fields
            if (firstNumber.isEmpty()) {
                //Set an error to the firstNumber edit text
                myFnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                //set an error to the secondNumber
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else {
                //Proceed to calculate the two numbers
                var answer = firstNumber.toDouble() / secondNumber.toDouble()
                //Display the result of the text view myAnser
                myAnswer!!.text = answer.toString()
            }
        }
        buttonMultiply!!.setOnClickListener{
            //Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()

            //Check if the user is submitting empty fields
            if (firstNumber.isEmpty()) {
                //Set an error to the firstNumber edit text
                myFnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                //set an error to the secondNumber
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else {
                //Proceed to calculate the two numbers
                var answer = firstNumber.toDouble() * secondNumber.toDouble()
                //Display the result of the text view myAnser
                myAnswer!!.text = answer.toString()
            }
        }
    }
}