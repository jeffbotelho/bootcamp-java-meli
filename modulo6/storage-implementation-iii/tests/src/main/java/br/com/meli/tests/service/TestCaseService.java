package br.com.meli.tests.service;

import br.com.meli.tests.model.TestCase;
import br.com.meli.tests.repository.TestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestCaseService {

    @Autowired
    private TestCaseRepository testCaseRepository;


    public List<TestCase> returnAll() {
        return testCaseRepository.findAll();
    }

    public TestCase findById(Long id) {
        TestCase testCase = testCaseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TestCase nao encontrado!"));

        return testCase;
    }

    public List<TestCase> searchByDate(LocalDate lastUpdate) {
        return testCaseRepository.findByLastUpdateGreaterThanEqual(lastUpdate);
    }

    public TestCase addTest(TestCase testCase) {
        TestCase resultTestCase = testCaseRepository.save(testCase);
        return resultTestCase;
    }

    // atualiza por RerequestBody e PathVarible
    public void updateTest(TestCase test, Long id) {
        test.setIdCase(id);
        testCaseRepository.save(test);
    }

    public void deleteTest(Long id) {
        testCaseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TestCase nao encontrado!"));

        testCaseRepository.deleteById(id);
    }
}
