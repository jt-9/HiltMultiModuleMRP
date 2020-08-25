package com.example.db.entitity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DbDummyEntity(
    @PrimaryKey
    val id: Long
)