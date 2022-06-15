package com.example.basketcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvTeamACount = findViewById<TextView>(R.id.tvTeamACount)
        val tvTeamBCount = findViewById<TextView>(R.id.tvTeamBCount)

        val btnTeamA3 = findViewById<Button>(R.id.btnTeamA3)
        val btnTeamA2 = findViewById<Button>(R.id.btnTeamA2)
        val btnTeamA1 = findViewById<Button>(R.id.btnTeamA1)

        val btnTeamB3 = findViewById<Button>(R.id.btnTeamB3)
        val btnTeamB2 = findViewById<Button>(R.id.btnTeamB2)
        val btnTeamB1 = findViewById<Button>(R.id.btnTeamB1)

        val btnReset = findViewById<Button>(R.id.btnReset)

        var teamAPoints :Int = 0
        var teamBPoints :Int= 0

        fun updateScore(){
            tvTeamACount.text = teamAPoints.toString()
            tvTeamBCount.text = teamBPoints.toString()

        }
        fun addPoint(point :Int, team :Char){
            if(team == 'A')
                teamAPoints += point
            else
                teamBPoints += point
            updateScore()
        }

        btnTeamA3.setOnClickListener(){
            addPoint(3, 'A')
        }
        btnTeamA2.setOnClickListener(){
            addPoint(2, 'A')
        }
        btnTeamA1.setOnClickListener(){
            addPoint(1, 'A')
        }


        btnTeamB3.setOnClickListener(){
            addPoint(3, 'B')
        }
        btnTeamB2.setOnClickListener(){
            addPoint(2, 'B')
        }
        btnTeamB1.setOnClickListener(){
            addPoint(1, 'B')
        }

        btnReset.setOnClickListener(){
            teamAPoints = 0
            teamBPoints = 0
            updateScore()
        }

    }
}