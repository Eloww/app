package fr.eni.mod9tp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Voiture::class), version = 1, exportSchema = false)
abstract class ConcessionnaireDb: RoomDatabase() {
    abstract fun voitureDao(): VoitureDao

    companion object {
        @Volatile
        private var INSTANCE: ConcessionnaireDb? = null

        fun getInstance(ctx: Context): ConcessionnaireDb {
            var instance = INSTANCE

            if (instance == null) {
                instance = Room.databaseBuilder(
                    ctx,
                    ConcessionnaireDb::class.java,
                    "concessionnaire"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
            }

            return instance
        }
    }
}