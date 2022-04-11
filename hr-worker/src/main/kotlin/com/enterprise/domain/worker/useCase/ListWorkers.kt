package com.enterprise.domain.worker.useCase

import com.enterprise.domain.worker.entity.Worker

interface ListWorkers {
    fun list(): List<Worker>;
}