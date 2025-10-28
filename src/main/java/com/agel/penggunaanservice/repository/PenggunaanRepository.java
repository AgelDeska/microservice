package com.agel.penggunaanservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agel.penggunaanservice.model.Penggunaan;

@Repository
public interface PenggunaanRepository extends JpaRepository<Penggunaan, Long> {
}