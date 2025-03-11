package com.example.minhasreceitas.domain.usecase

import com.example.minhasreceitas.domain.repository.RecipeRepository

class GetAllRecipesUseCase constructor(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke() = repository.getAll()}