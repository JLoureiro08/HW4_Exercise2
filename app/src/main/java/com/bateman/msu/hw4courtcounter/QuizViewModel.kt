package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.ViewModel
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding

private const val TAG = "QuizViewModel"

class QuizViewModel: ViewModel() {

    /*init{
        Log.d(TAG, "ViewModel instance created")
    }

    override fun onCleared(){
        super.onCleared()
        Log.d(TAG, "ViewModel instance about to be destroyed")
    }*/

    private lateinit var binding: ActivityMainBinding


    val score: Int = 0
    var scoreTeamA = 0
    var scoreTeamB = 0


    fun oneTeamA() {
        scoreTeamA++
    }

    fun twoTeamA() {
        scoreTeamA += 2
    }

    fun threeTeamA() {
        scoreTeamA += 3
    }

    fun oneTeamB() {
        scoreTeamB++
    }

    fun twoTeamB() {
        scoreTeamB += 2
    }

    fun threeTeamB() {
        scoreTeamB += 3
    }

    fun resetScore() {
        scoreTeamA = 0
        scoreTeamB = 0
    }

    /*fun teamAScore() {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()

    }

    fun teamBScore() {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }*/


}