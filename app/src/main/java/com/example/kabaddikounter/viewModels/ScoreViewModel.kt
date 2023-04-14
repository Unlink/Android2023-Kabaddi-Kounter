package com.example.kabaddikounter.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel


class ScoreViewModel : ViewModel() {
    var scoreA : Int = 0
    var scoreB : Int = 0

    fun incrementScoreA(points: Int = 1) {
        scoreA+=points
    }

    fun incrementScoreB(points: Int = 1) {
        scoreB+=points
    }

    fun reset() {
        scoreA = 0;
        scoreB = 0;
    }
}
