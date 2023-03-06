package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding

 private const val TAG = "MainActivity"

/// this is a comment

class MainActivity : AppCompatActivity() {

    var scoreTeamA = 0
    var scoreTeamB = 0
    private lateinit var binding: ActivityMainBinding
    private val quizViewModel :QuizViewModel by viewModels()
    //private lateinit var viewModel:QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "Got a QuizViewModel:$quizViewModel")
        //viewModel = ViewModelProvider(this).get(quizViewModel::class.java)

    }
        /**
         * Increase the score for Team A by 1 point.
         */
        fun addOneForTeamA(v: View?) {
            //scoreTeamA++
            quizViewModel.oneTeamA()
            displayForTeamA(quizViewModel.scoreTeamA)
        }

        /**
         * Increase the score for Team A by 2 points.
         */
        fun addTwoForTeamA(v: View?) {
            //scoreTeamA += 2
            quizViewModel.twoTeamA()
            displayForTeamA(quizViewModel.scoreTeamA)
        }

        /**
         * Increase the score for Team A by 3 points.
         */
        fun addThreeForTeamA(v: View?) {
            //scoreTeamA += 3
            quizViewModel.threeTeamA()
            displayForTeamA(quizViewModel.scoreTeamA)
        }

        /**
         * Increase the score for Team B by 1 point.
         */
        fun addOneForTeamB(v: View?) {
            //scoreTeamB++
            quizViewModel.oneTeamB()
            displayForTeamB(quizViewModel.scoreTeamB)
        }

        /**
         * Increase the score for Team B by 2 points.
         */
        fun addTwoForTeamB(v: View?) {
            //scoreTeamB += 2
            quizViewModel.twoTeamB()
            displayForTeamB(quizViewModel.scoreTeamB)
        }

        /**
         * Increase the score for Team B by 3 points.
         */
        fun addThreeForTeamB(v: View?) {
            //scoreTeamB += 3
            quizViewModel.threeTeamB()
            displayForTeamB(quizViewModel.scoreTeamB)
        }

        /**
         * Resets the score for both teams back to 0.
         */
        fun resetScore(v: View?) {
            //scoreTeamA = 0
            //scoreTeamB = 0
            quizViewModel.resetScore()
            displayForTeamA(quizViewModel.scoreTeamA)
            displayForTeamB(quizViewModel.scoreTeamB)
        }

        /**
         * Displays the given score for Team A.
         */
        fun displayForTeamA(score: Int) {
            val scoreView = binding.teamAScore
            scoreView.text = score.toString()
        }

        /**
         * Displays the given score for Team B.
         */
        fun displayForTeamB(score: Int) {
            val scoreView = binding.teamBScore
            scoreView.text = score.toString()
        }


}