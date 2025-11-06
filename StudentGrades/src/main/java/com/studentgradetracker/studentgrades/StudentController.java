package com.studentgradetracker.studentgrades;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repo;
    private final ConversionService conversionService;

    public StudentController(StudentRepository repo, ConversionService conversionService) {
        this.repo = repo;
        this.conversionService = conversionService;
    }

    @PostMapping
    public StudentInfo create(@RequestBody StudentInfo student) {
        return repo.save(student);
    }

    @GetMapping("/{id}/gpa")
    public double getGpa(@PathVariable Long id) {
        StudentInfo student = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return conversionService.calculateGpa(student);
    }

    @GetMapping
    public List<StudentInfo> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public StudentInfo getOne(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public StudentInfo update(@PathVariable Long id, @RequestBody StudentInfo updated) {
        StudentInfo existing = repo.findById(id).orElseThrow();
        existing.setName(updated.getName());
        existing.setEng_grade(updated.getEng_grade());
        existing.setGym_grade(updated.getGym_grade());
        existing.setMath_grade(updated.getMath_grade());
        existing.setSci_grade(updated.getSci_grade());
        return repo.save(existing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
