package entity;

import entity.TestUnit;


import java.util.List;

public class Report {
    private List<TestUnit> tests;

    public Report() {
    }

    public Report(List<TestUnit> tests) {
        this.tests = tests;
    }

    public List<TestUnit> getTests() {
        return tests;
    }

    public void setTests(List<TestUnit> tests) {
        this.tests = tests;
    }
}


