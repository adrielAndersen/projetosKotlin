package com.adrielandersen.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adrielandersen.calculadora.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo
        //botão "1" >

        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }
        //botão "2" >

        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }
        //botão "3" >

        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }
        //botão "4" >

        binding.quatro.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }
        //botão "5" >

        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }
        //botão "6" >

        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }
        //botão "7" >

        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }
        //botão "8" >

        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }
        //botão "9" >

        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }
        //botão "0" >

        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }
        //botão "(" >

        binding.parenteseAbrindo.setOnClickListener {
            calculo.text = "${calculo.text}("
        }
        //botão ")" >

        binding.parenteseFechando.setOnClickListener {
            calculo.text = "${calculo.text})"
        }
        //botão "." >

        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }
        //botão "*" >

        binding.mult.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }
        //botão "/" >

        binding.divisao.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }
        //botão "+" >

        binding.soma.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }
        //botão "-" >

        binding.subtracao.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }
        //botão "backspace" >

        binding.apagar.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }
        //botão "CE" >

        binding.CE.setOnClickListener {
            calculo.text = ""
            binding.resultado.text = ""
        }
        //botão "Igual" >

        binding.igual.setOnClickListener {
            val resultadoCalculo = Expression(calculo.text.toString()).calculate()
            if (resultadoCalculo.isNaN()) {
                binding.resultado.text = "Expressão inválida"
            } else {
                binding.resultado.text = resultadoCalculo.toString()
            }
        }
    }
}