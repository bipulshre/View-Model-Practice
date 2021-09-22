package com.example.viewmodelpractice.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class testViewModel : ViewModel() {
    var number=0;

    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }


}