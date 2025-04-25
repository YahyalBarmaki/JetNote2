package com.example.jetnote2.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.jetnote2.model.Note
import com.example.jetnote2.utils.DateConverter
import com.example.jetnote2.utils.UUIDConverter

class NoteDataBase {
    @Database(entities = [Note::class], version = 1, exportSchema = false)
    @TypeConverters(DateConverter::class, UUIDConverter::class)
    abstract class NoteDataBase: RoomDatabase() {
        abstract fun noteDao(): NoteDatabaseDao
    }}