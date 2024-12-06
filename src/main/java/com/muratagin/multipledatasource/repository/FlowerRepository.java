package com.muratagin.multipledatasource.repository;

import com.muratagin.multipledatasource.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, UUID> {
}
