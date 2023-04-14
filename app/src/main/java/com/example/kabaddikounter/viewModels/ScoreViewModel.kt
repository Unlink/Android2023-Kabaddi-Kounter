package com.example.kabaddikounter.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel


class ScoreViewModel : ViewModel() {
    val textExample =  MutableLiveData<String>("test")

    private val _scoreA = MutableLiveData<Int>(0)
    val scoreA: LiveData<Int>
        get() = _scoreA

    private val _scoreB = MutableLiveData<Int>(0)
    val scoreB: LiveData<Int>
        get() = _scoreB

    fun incrementScoreA(points: Int = 1) {
        _scoreA.value = _scoreA.value!! + points
    }

    fun incrementScoreB(points: Int = 1) {
        _scoreB.value = _scoreB.value!! + points
    }

    fun reset() {
        _scoreA.value = 0;
        _scoreB.value = 0;
    }
}
