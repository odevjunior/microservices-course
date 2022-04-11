package com.enterprise.domain.payment.useCase

import com.enterprise.domain.payment.entity.Payment

interface GetTotal {
    fun getTotal(workerId: Long, workedDays: Int): Payment
}