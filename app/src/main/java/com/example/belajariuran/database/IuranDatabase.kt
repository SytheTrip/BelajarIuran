package com.example.belajariuran.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DumyTable::class], version = 1, exportSchema = false)
abstract class IuranDatabase : RoomDatabase() {
    abstract fun iuranDao(): IuranDao
}