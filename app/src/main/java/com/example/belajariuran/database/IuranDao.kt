package com.example.belajariuran.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface IuranDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDummy(iuran : DumyTable)

    @Delete
    suspend fun deleteDummy(iuran : DumyTable)

    @Query("SELECT * FROM iuranblok")
    fun getData(): Flow<List<DumyTable>>
}