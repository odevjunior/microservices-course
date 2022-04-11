package com.enterprise.application.dataprovider.worker

import com.enterprise.application.dataprovider.worker.repositories.WorkerRepostiory
import com.enterprise.application.dataprovider.worker.repositories.entity.mappers.WorkerMapper
import com.enterprise.domain.worker.entity.Worker
import com.enterprise.domain.worker.gateway.WorkersGateway
import jakarta.inject.Singleton

@Singleton
class WorkersGatewayImpl(
    private val workerRepostiory: WorkerRepostiory,
    private val workerMapper: WorkerMapper
): WorkersGateway {
    override fun getWorkers(): List<Worker> =
        workerRepostiory.findAll().map { workerMapper.toDomain(it) }

}