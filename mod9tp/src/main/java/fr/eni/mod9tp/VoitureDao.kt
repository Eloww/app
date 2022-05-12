package fr.eni.mod9tp

import androidx.room.*

@Dao
interface VoitureDao {
    @Insert
    fun insert(v: Voiture)

    @Query("SELECT * FROM Voiture WHERE id = :id")
    suspend fun getById(id: Long): Voiture

    @Query("SELECT * from Voiture")
    fun getAll(): List<Voiture>

    @Update
    fun update(a: Voiture)

    @Delete
    fun delete(a: Voiture)
}