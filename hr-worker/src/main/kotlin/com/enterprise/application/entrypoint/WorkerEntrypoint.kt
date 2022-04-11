package com.enterprise.application.entrypoint

import com.enterprise.domain.worker.useCase.ListWorkers
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("worker")
class WorkerEntrypoint(
    private val listWorkersUseCase: ListWorkers
){
    @Get
    fun getAllWorkers() = listWorkersUseCase.list()
}