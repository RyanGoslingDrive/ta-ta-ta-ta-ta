package ru.neoflex.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.practice.entity.Calculator;

@Repository
public interface CalculationRepository extends JpaRepository<Calculator, Integer> {
}
