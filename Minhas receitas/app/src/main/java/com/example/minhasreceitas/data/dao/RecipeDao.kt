package com.example.minhasreceitas.data.dao

import androidx.core.view.WindowInsetsCompat.Type.InsetsType
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.minhasreceitas.data.entity.RecipeEntity

@Dao
interface RecipeDao{

    @Query("Select * FROM recipe")
    fun getAll(): List<RecipeEntity>

    @Insert
    fun insert (recipe: RecipeEntity)

}