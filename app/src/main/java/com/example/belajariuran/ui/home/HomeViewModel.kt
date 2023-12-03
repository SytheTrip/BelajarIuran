package com.example.belajariuran.ui.home

import androidx.lifecycle.ViewModel
import com.example.belajariuran.repository.IuranRepository

class HomeViewModel (private  val iuranRepository: IuranRepository): ViewModel() {

    fun  testing():String{
        return iuranRepository.testing()
    }
}