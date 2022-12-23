package com.fxservice.repository;

import com.fxservice.entity.Fxrate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FxrateRepository extends JpaRepository<Fxrate,Integer> {
}
