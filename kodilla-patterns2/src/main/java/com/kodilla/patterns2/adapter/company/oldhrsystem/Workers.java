package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"77777777", "John", "Smith"},
            {"99999999", "Ivone", "Novak"},
            {"66666666", "Jessie", "Pinkman"},
            {"11111111", "Walter", "White"},
            {"22222222", "Clara", "Lanson"}};
    private double[] salaries = {
      4500.00,
      3700.00,
      4350.00,
      9000.00,
      6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers() {
        return workers;
    }
    public double[] getSalaries() {
        return salaries;
    }
}
