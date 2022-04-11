package com.enterprise.application.dataprovider.worker.repositories

import com.enterprise.application.dataprovider.worker.repositories.entity.Worker
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface WorkerRepostiory: JpaRepository<Worker, Long>