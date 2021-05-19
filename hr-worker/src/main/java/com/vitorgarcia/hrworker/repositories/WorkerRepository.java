package com.vitorgarcia.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorgarcia.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
