package com.example.belajariuran.repository

import android.content.Context
import com.example.belajariuran.database.IuranDatabase

class IuranRepository(private val context:Context, private val iuranDatabase: IuranDatabase) {

    fun testing():String{
        return "testing"
    }
}