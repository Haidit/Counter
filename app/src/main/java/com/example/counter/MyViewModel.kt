package com.example.counter

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var number = 0

    fun add(){
        number++
    }
}