package com.example.minhasreceitas.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.minhasreceitas.data.dao.RecipeDao
import com.example.minhasreceitas.data.entity.RecipeEntity

//classe abstrata
@Database(entities = [
    RecipeEntity::class
],
    version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun recipeDao() : RecipeDao
}