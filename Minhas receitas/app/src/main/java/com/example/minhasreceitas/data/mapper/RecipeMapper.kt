package com.example.minhasreceitas.data.mapper

import com.example.minhasreceitas.data.entity.RecipeEntity
import com.example.minhasreceitas.domain.model.RecipeDomain

//mapper vai um dominio em entitade ou uma entidade em dominio
//extendion fun

fun RecipeDomain.toEntity() = RecipeEntity(
    id = id,
    name = name
)

fun RecipeEntity.toDomain() = RecipeDomain(
    id= id,
    name = name
)