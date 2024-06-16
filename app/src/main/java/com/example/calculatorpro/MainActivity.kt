package com.example.calculatorpro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculatorpro.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binading:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binading = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binading.root)
        binading.acbtn.setOnClickListener{
            binading.inputtxt.text=" "
            binading.outputtxt.text=" "
        }
        binading.btn0.setOnClickListener{
            binading.inputtxt.append("0")
        }
        binading.btn1.setOnClickListener{
            binading.inputtxt.append("1")
        }
        binading.btn2.setOnClickListener{
            binading.inputtxt.append("2")
        }
        binading.btn3.setOnClickListener{
            binading.inputtxt.append("3")
        }
        binading.btn4.setOnClickListener{
            binading.inputtxt.append("4")
        }
        binading.btn5.setOnClickListener{
            binading.inputtxt.append("5")
        }
        binading.btn6.setOnClickListener{
            binading.inputtxt.append("6")
        }
        binading.btn7.setOnClickListener{
            binading.inputtxt.append("7")
        }
        binading.btn8.setOnClickListener{
            binading.inputtxt.append("8")
        }
        binading.btn9.setOnClickListener{
            binading.inputtxt.append("9")
        }
        binading.dot.setOnClickListener{
            binading.inputtxt.append(".")
        }
        binading.divide.setOnClickListener{
            binading.inputtxt.append("/")
        }
        binading.multiply.setOnClickListener{
            binading.inputtxt.append("*")
        }
        binading.plus.setOnClickListener{
            binading.inputtxt.append("+")
        }
        binading.minus.setOnClickListener{
            binading.inputtxt.append("-")
        }
        binading.openbracket.setOnClickListener{
            binading.inputtxt.append("(")
        }
        binading.closebracket.setOnClickListener{
            binading.inputtxt.append(")")
        }
        binading.equal.setOnClickListener{
            val exception = ExpressionBuilder(binading.inputtxt.text.toString()).build()
            val res = exception.evaluate()
            val longres =res.toLong()
            if(res == longres.toDouble())
            {
                binading.outputtxt.text= longres.toString()

            }else{
                binading.outputtxt.text = res.toString()
            }

        }
    }
}