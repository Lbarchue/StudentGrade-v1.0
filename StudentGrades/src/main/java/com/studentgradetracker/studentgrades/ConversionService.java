package com.studentgradetracker.studentgrades;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ConversionService {

    private final HashMap<String, Double> conversion = new HashMap<>();

    public ConversionService() {
        // initialize conversion map
        conversion.put("A+", 4.0);
        conversion.put("A", 4.0);
        conversion.put("A-", 3.7);
        conversion.put("B+", 3.3);
        conversion.put("B", 3.0);
        conversion.put("B-", 2.7);
        conversion.put("C+", 2.3);
        conversion.put("C", 2.0);
        conversion.put("C-", 1.7);
        conversion.put("D", 1.0);
        conversion.put("F", 0.0);
    }

    //Convert letter grades to numeric
    public double getMathGrade(StudentInfo student) {
        return conversion.get(student.getMath_grade());
    }

    public double getSciGrade(StudentInfo student) {
        return conversion.get(student.getSci_grade());
    }

    public double getEngGrade(StudentInfo student) {
        return conversion.get(student.getEng_grade());
    }

    public double getGymGrade(StudentInfo student) {
        return conversion.get(student.getGym_grade());
    }

    //Calculate GPA
    public double calculateGpa(StudentInfo student) {
        double total = getMathGrade(student)
                + getSciGrade(student)
                + getEngGrade(student)
                + getGymGrade(student);
        return total / 4;
    }
}
