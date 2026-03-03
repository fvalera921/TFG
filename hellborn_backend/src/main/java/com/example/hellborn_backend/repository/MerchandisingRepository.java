package com.example.hellborn_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hellborn_backend.entity.Merchandising;

@Repository
public interface MerchandisingRepository extends JpaRepository<Merchandising, Integer> {

    List<Merchandising> findByTipo(String tipo);
}
