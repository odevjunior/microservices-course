package com.enterprise.application.dataprovider.worker.repositories.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="worker")
data class Worker(
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val dailyIncome: Double
)
