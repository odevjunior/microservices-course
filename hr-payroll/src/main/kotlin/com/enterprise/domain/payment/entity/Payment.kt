package com.enterprise.domain.payment.entity

data class Payment(
    private val name: String,
    private val dailyIncome: Double,
    private val days: Int
)
