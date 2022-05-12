package fr.eni.mod9magasinroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = arrayOf(Article::class), version = 1, exportSchema = false)
abstract class MagasinDb: RoomDatabase() {
    abstract fun articleDao(): ArticleDao

    companion object {
        @Volatile
        private var INSTANCE: MagasinDb? = null

        fun getInstance(ctx: Context): MagasinDb {
            var instance = INSTANCE

            if (instance == null) {
                instance = Room.databaseBuilder(
                    ctx,
                    MagasinDb::class.java,
                    "magasin"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
            }

            return instance
        }
    }
}