package com.enterprise.domain.worker.useCase

import com.enterprise.domain.worker.entity.Worker
import com.enterprise.domain.worker.gateway.WorkersGateway

class ListWorkersUseCase(
    private val workersGateway: WorkersGateway
): ListWorkers {
    override fun list(): List<Worker> =
        workersGateway.getWorkers()

}