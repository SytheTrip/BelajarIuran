package com.example.belajariuran.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "iuranblok")
data class DumyTable(
    @PrimaryKey(autoGenerate = false)
    val id: Long,
    val name: String,
)

