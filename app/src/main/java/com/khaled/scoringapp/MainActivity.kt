package com.khaled.scoringapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var points1 : TextView
    lateinit var points2 : TextView

    lateinit var Add5for1 : Button
    lateinit var Add3for1 : Button
    lateinit var Add1for1 : Button

    lateinit var Add5for2 : Button
    lateinit var Add3for2 : Button
    lateinit var Add1for2 : Button

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        points1 = findViewById(R.id.points1)
        points2 = findViewById(R.id.points2)


        Add5for1 = findViewById(R.id.Add5for1)
        Add3for1 = findViewById(R.id.Add3for1)
        Add1for1 = findViewById(R.id.Add1for1)

        Add5for2 = findViewById(R.id.Add5for2)
        Add3for2 = findViewById(R.id.Add3for2)
        Add1for2 = findViewById(R.id.Add1for2)


        var p1 = 0
        var p2 = 0

        Add5for1.setOnClickListener {
            p1+=5
            add5to1(p1)
        }

        Add3for1.setOnClickListener {
            p1+=3
            add3to1(p1)
        }

        Add1for1.setOnClickListener {
            p1+=1
            add1to1(p1)
        }
    //..................................................
        Add5for2.setOnClickListener {
            p2+=5
            add5to2(p2)
        }

        Add3for2.setOnClickListener {
            p2+=3
            add3to2(p2)
        }

        Add1for2.setOnClickListener {
            p2+=1
            add1to2(p2)
        }

    }
    //_______________________________________________________________
    private fun add5to1(i: Int) {
        val result1 = i
        points1.text = result1.toString()
    }
    private fun add3to1(i: Int) {
        val result1 = i
        points1.text = result1.toString()

    }
    private fun add1to1(i: Int =0) {
        val result1 = i
        points1.text = result1.toString()
    }

    private fun add5to2(i: Int) {
        val result = i
        points2.text = result.toString()
    }
    private fun add3to2(i: Int) {
        val result = i
        points2.text = result.toString()

    }
    private fun add1to2(i: Int =0) {
        val result = i
        points2.text = result.toString()
    }

}