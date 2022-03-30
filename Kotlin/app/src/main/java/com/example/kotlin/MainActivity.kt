package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val constante: String = "una constante"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Int = 1
        //a = 6
        var b: Int = 2
        b = 4

        Log.i("Basics","Valor de b $b")
        Log.i("Basics",constante)
        Log.d("Basics","d")
        Log.w("Basics","w")

        unSwitch()
        unIf(1)
        unFor()
        unWhile()
    }
    fun unSwitch(){
        val x = 1
        when (x) {
            1 -> Log.i("Basics","Es uno")
            2 -> {
                var algo = "lorem"
                var otro = "ipsum"
                Log.i("Basics",algo + otro)
            }
            else -> Log.i("Basics","No coincido")
        }
    }
    fun unIf(a: Int): Boolean{
        if (a==1)
            return true
        else
            return false
    }

    fun unFor(){
        var array = arrayOf(1,2,3,4,5)
        for (numero in array){
            Log.i("Basics",numero.toString())
        }

        Log.i("Basics","1..3")
        for(i in 1..3){
            Log.i("Basics",i.toString())
        }

        Log.i("Basics","6 downTo 0 step 2")
        for(i in 6 downTo 0 step 2){
            Log.i("Basics",i.toString())
        }
    }
    fun unWhile(){
        var x = 0
        while(x < 5){
            Log.i("Basics",x.toString())
            x++
        }
        x = 0
        do{
            Log.i("Basics",x.toString())
            x++
        }while(x < 5)
    }
}