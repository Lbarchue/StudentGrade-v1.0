package com.studentgradetracker.studentgrades;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String sci_grade;
    private String math_grade;
    private String eng_grade;
    private String gym_grade;

    public StudentInfo() {}

    public StudentInfo(String name, String sci_grade, String math_grade, String eng_grade, String gym_grade) {
        this.name = name;
        this.sci_grade = sci_grade;
        this.math_grade = math_grade;
        this.eng_grade = eng_grade;
        this.gym_grade = gym_grade;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setEng_grade(String eng_grade) {
        this.eng_grade = eng_grade;
    }
    public void setGym_grade(String gym_grade) {
        this.gym_grade = gym_grade;
    }
    public void setMath_grade(String math_grade) {

        this.math_grade = math_grade;
    }
    public void setSci_grade(String sci_grade) {

        this.sci_grade = sci_grade;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getEng_grade() {
        return eng_grade;
    }
    public String getGym_grade() {
        return gym_grade;
    }
    public String getSci_grade() {
        return sci_grade;
    }
    public String getMath_grade() {
        return math_grade;
    }

}
