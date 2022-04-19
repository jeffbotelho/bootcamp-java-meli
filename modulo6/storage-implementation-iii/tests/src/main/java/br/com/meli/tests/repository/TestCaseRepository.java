package br.com.meli.tests.repository;

import br.com.meli.tests.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TestCaseRepository extends JpaRepository<TestCase, Long> {

    List<TestCase> findByLastUpdateGreaterThanEqual(LocalDate lastUpdate);

}
