package com.example.calculator

//import android.annotation.SuppressLint
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding
import kotlin.properties.Delegates
import kotlin.String

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    var addition = '+'
    //var subtraction ='-'
  //  var multiplication ='*'
    //var division = '/'
  //  var equalTo = '0'
    var action:String? = null
    var val1:Double = Double.NaN
    var val2 : Double? = null
   // private lateinit var toastString:String
  //  val toast = Toast.makeText(this,toastString,Toast.LENGTH_SHORT)

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.zero.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "0"
        }
        binding.one.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "1"
        }
        binding.two.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "2"
        }
        binding.three.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "3"
        }
        binding.four.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "4"
        }
        binding.five.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "5"
        }
        binding.six.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "6"
        }
        binding.seven.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "7"
        }
        binding.eight.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "8"
        }
        binding.nine.setOnClickListener {
            binding.numericalDisplay.text = binding.numericalDisplay.text.toString() + "9"
        }
        binding.add.setOnClickListener{
            //computeCalculations()
            val element = "$val1+"
            action = addition.toString()
            binding.resultDisplay.setText(element)
            binding.numericalDisplay.setText(null)
        }
    }



}


