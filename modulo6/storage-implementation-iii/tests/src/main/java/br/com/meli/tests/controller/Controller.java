package br.com.meli.tests.controller;

import br.com.meli.tests.model.TestCase;
import br.com.meli.tests.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/testcases")
public class Controller {

    @Autowired
    private TestCaseService testCaseService;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping
    public ResponseEntity<List<TestCase>> listAll() {

        return ResponseEntity.ok(testCaseService.returnAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> findById(@PathVariable Long id){

        return ResponseEntity.ok(testCaseService.findById(id));
    }

    @GetMapping("/date-search")
    public ResponseEntity<List<TestCase>> dateSearch(
            @RequestParam(name = "last_update")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate lastUpdate) {

        return ResponseEntity.ok(testCaseService.searchByDate(lastUpdate));
    }

    @PostMapping("/new")
    public ResponseEntity<TestCase> newTest(@RequestBody TestCase testCase) {

        TestCase tc = testCaseService.addTest(testCase);

        return ResponseEntity.status(HttpStatus.CREATED).body(tc);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestCase> updateTest(@RequestBody TestCase test,
                                               @PathVariable("id") Long id) {

        this.testCaseService.updateTest(test, id);

        return ResponseEntity.ok().body(test);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        testCaseService.deleteTest(id);
        return ResponseEntity.noContent().build();
    }
}
