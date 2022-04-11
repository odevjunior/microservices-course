package com.enterprise.domain.payment.useCase

import com.enterprise.domain.payment.entity.Payment
import jakarta.inject.Singleton

@Singleton
class GetTotalUseCase: GetTotal {
    override fun getTotal(workerId: Long, workedDays: Int): Payment = Payment("Test", 100.00, 10)

}