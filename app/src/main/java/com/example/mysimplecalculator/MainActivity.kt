package com.example.mysimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Start
    var txtViewAnswer: TextView? = null

    var editTextF: EditText? = null
    var editTextS: EditText? = null

    var btnAdd: Button? = null
    var btnSubtract: Button? = null
    var btnDivide: Button? = null
    var btnMultiply: Button? = null

    //End
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtViewAnswer = findViewById(R.id.txtViewAnswer)

        editTextF = findViewById(R.id.edtTextF)
        editTextS = findViewById(R.id.edtTextS)

        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnDivide = findViewById(R.id.btnDivide)
        btnMultiply = findViewById(R.id.btnMultiply)

        //Add Listeners to the Buttons
        btnAdd!!.setOnClickListener {
            //create variable to store first and second number
            //fetch data from the input fields
            var firstNumber = editTextF!!.text.toString().trim()
            var secondNumber = editTextS!!.text.toString().trim()
            //check if the input fields are empty
            if (firstNumber.isEmpty()) {
                editTextF!!.setError("Please fill")
                editTextF!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                editTextS!!.setError("please fill")
                editTextS!!.requestFocus()
            } else {
                //create variable to store the answer
                //create formula to claculate the answer
                var answer = firstNumber.toDouble() + secondNumber.toDouble()
                //display the answer on the texview in a string
                txtViewAnswer!!.text = answer.toString()
            }
        }
        btnSubtract!!.setOnClickListener {
            var firstNumber = editTextF!!.text.toString().trim()
            var secondNumber = editTextS!!.text.toString().trim()
            //check if the input fields are empty
            if (firstNumber.isEmpty()) {
                editTextF!!.setError("Please fill")
                editTextF!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                editTextS!!.setError("please fill")
                editTextS!!.requestFocus()
            } else {
                //create variable to store the answer
                //create formula to claculate the answer
                var answer = firstNumber.toDouble() - secondNumber.toDouble()
                //display the answer on the texview in a string
                txtViewAnswer!!.text = answer.toString()

            }


        }
        btnDivide!!.setOnClickListener {
            var firstNumber = editTextF!!.text.toString().trim()
            var secondNumber = editTextS!!.text.toString().trim()
            //check if the input fields are empty
            if (firstNumber.isEmpty()) {
                editTextF!!.setError("Please fill")
                editTextF!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                editTextS!!.setError("please fill")
                editTextS!!.requestFocus()
            } else {
                //create variable to store the answer
                //create formula to claculate the answer
                var answer = firstNumber.toDouble() / secondNumber.toDouble()
                //display the answer on the texview in a string
                txtViewAnswer!!.text = answer.toString()
            }
        }
        btnMultiply!!.setOnClickListener {
            var firstNumber = editTextF!!.text.toString().trim()
            var secondNumber = editTextS!!.text.toString().trim()
            //check if the input fields are empty
            if (firstNumber.isEmpty()) {
                editTextF!!.setError("Please fill")
                editTextF!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                editTextS!!.setError("please fill")
                editTextS!!.requestFocus()
            } else {
                //create variable to store the answer
                //create formula to claculate the answer
                var answer = firstNumber.toDouble() * secondNumber.toDouble()
                //display the answer on the texview in a string
                txtViewAnswer!!.text = answer.toString()
            }
        }
    }
}





