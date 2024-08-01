package com.example.bachelorandroid.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "balance")
data class Balance(
    @PrimaryKey
    val balance: Double
)
