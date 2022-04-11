package com.enterprise.domain.worker.gateway

import com.enterprise.domain.worker.entity.Worker

interface WorkersGateway {
    fun getWorkers(): List<Worker>
}