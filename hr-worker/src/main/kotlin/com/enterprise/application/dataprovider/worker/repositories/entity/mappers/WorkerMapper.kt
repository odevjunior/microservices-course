package com.enterprise.application.dataprovider.worker.repositories.entity.mappers

import com.enterprise.application.dataprovider.worker.repositories.entity.Worker as WorkerDB
import com.enterprise.domain.worker.entity.Worker
import org.mapstruct.Mapper

@Mapper
interface WorkerMapper {
    fun toDomain(worker: WorkerDB): Worker
    fun toApplication(worker: Worker): WorkerDB
}