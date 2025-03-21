package com.hackerrank.corebanking.repository;

import com.hackerrank.corebanking.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    Optional<Loan> findById(Long id);
}
