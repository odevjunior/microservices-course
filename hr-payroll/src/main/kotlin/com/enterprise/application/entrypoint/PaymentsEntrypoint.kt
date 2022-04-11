package com.enterprise.application.entrypoint

import com.enterprise.domain.payment.useCase.GetTotal
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller("payments")
class PaymentsEntrypoint(
    private val getTotalUseCase: GetTotal
) {

    @Get("{workerId}/{workedDays}")
    fun getTotal(@QueryValue("workerId") workerId: Long, @QueryValue("workedDays") workedDays: Int) = getTotalUseCase.getTotal(workerId, workedDays)
}