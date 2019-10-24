package com.example.pratical1wed2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random;
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp()}
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset()}
    }

    private fun rollDice(){
        Toast.makeText(this, "Dice Rolled",
           Toast.LENGTH_SHORT).show()

        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()

    }


    private fun countUp(){

        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)


        if(resultText1.text =="Hello World!"){
            resultText1.text = "1"
        }else{
            if(resultText1.text.toString().toInt() < 6){
                resultText1.text = (resultText1.text.toString().toInt() +1).toString()
            }
        }
        if(resultText2.text =="Hello World!"){
            resultText2.text = "1"
        }else{
            if(resultText2.text.toString().toInt() < 6){
                resultText2.text = (resultText2.text.toString().toInt() +1).toString()
            }
        }

        if(resultText3.text =="Hello World!"){
            resultText3.text = "1"
        }else{
            if(resultText3.text.toString().toInt() < 6){
                resultText3.text = (resultText3.text.toString().toInt() +1).toString()
            }
        }
    }
    private fun reset(){
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        resultText1.text="Hello World!"
        resultText2.text="Hello World!"
        resultText3.text="Hello World!"
    }
}
