package com.example.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.db.entitity.DbDummyEntity

@Database(
    entities = [
        DbDummyEntity::class
    ],
    version = 1, exportSchema = false
)
@TypeConverters()
abstract class AppDataBase : RoomDatabase() {

    companion object {
        fun create(context: Context, dbName: String): AppDataBase {
            return Room.databaseBuilder(context, AppDataBase::class.java, dbName)
                .fallbackToDestructiveMigration()
                .build()
        }
    }

//    abstract fun getAuthDao(): AuthAndUserDao
}
