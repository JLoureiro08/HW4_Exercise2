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
    //private val quizViewModel :QuizViewModel by viewModels()    HAD TO TAKE THIS PART OUT AND ADD BACK IN THE SCOREVIEWMODEL
    private lateinit var scoreViewModel: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Log.d(TAG, "Got a QuizViewModel:$quizViewModel")
        //viewModel = ViewModelProvider(this).get(quizViewModel::class.java)  //This seems to be where some problems were
        scoreViewModel = ViewModelProvider(this)[QuizViewModel::class.java]

        displayForTeamA(scoreViewModel.scoreTeamA)     //Had to add this part into the beginning instead of farther in the code
        displayForTeamB(scoreViewModel.scoreTeamB)
    }
        /**
         * Increase the score for Team A by 1 point.
         */
        fun addOneForTeamA(v: View?) {
            //scoreTeamA++
            //quizViewModel.scoreTeamA ++
            scoreViewModel.scoreTeamA ++
            //displayForTeamA(quizViewModel.scoreTeamA) I tried to use quizViewModel rather than scoreViewModel
            displayForTeamA(scoreViewModel.scoreTeamA)
        }

        /**
         * Increase the score for Team A by 2 points.
         */
        fun addTwoForTeamA(v: View?) {
            //scoreTeamA += 2
            scoreViewModel.scoreTeamA += 2
            displayForTeamA(scoreViewModel.scoreTeamA)
        }

        /**
         * Increase the score for Team A by 3 points.
         */
        fun addThreeForTeamA(v: View?) {
            //scoreTeamA += 3
            scoreViewModel.scoreTeamA += 3
            displayForTeamA(scoreViewModel.scoreTeamA)
        }

        /**
         * Increase the score for Team B by 1 point.
         */
        fun addOneForTeamB(v: View?) {
            //scoreTeamB++
            scoreViewModel.scoreTeamB ++
            displayForTeamB(scoreViewModel.scoreTeamB)
        }

        /**
         * Increase the score for Team B by 2 points.
         */
        fun addTwoForTeamB(v: View?) {
            //scoreTeamB += 2
            scoreViewModel.scoreTeamB += 2
            displayForTeamB(scoreViewModel.scoreTeamB)
        }

        /**
         * Increase the score for Team B by 3 points.
         */
        fun addThreeForTeamB(v: View?) {
            //scoreTeamB += 3
            scoreViewModel.scoreTeamB += 3
            displayForTeamB(scoreViewModel.scoreTeamB)
        }

        /**
         * Resets the score for both teams back to 0.
         */
        fun resetScore(v: View?) {
            //scoreTeamA = 0
            //scoreTeamB = 0
            //quizViewModel.resetScore()    Tried to reset the score after already making it 0
            scoreViewModel.scoreTeamA = 0
            scoreViewModel.scoreTeamB = 0
            displayForTeamA(scoreViewModel.scoreTeamA)
            displayForTeamB(scoreViewModel.scoreTeamB)
        }

        /**
         * Displays the given score for Team A.
         */
        fun displayForTeamA(score: Int) {
            val scoreView = binding.teamAScore
            scoreView.text = score.toString()
            Log.d(TAG, "Score for Team A = %score")    //I had everything right for these I just wanted to add the Logs to see when the display is being updated
        }

        /**
         * Displays the given score for Team B.
         */
        fun displayForTeamB(score: Int) {
            val scoreView = binding.teamBScore
            scoreView.text = score.toString()
            Log.d(TAG, "Score for Team B = %score")
        }


}