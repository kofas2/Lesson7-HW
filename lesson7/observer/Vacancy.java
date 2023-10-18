package ru.geekbrains.lesson7.observer;

public class Vacancy {
    private String title;
    private int minSalary;
    private int maxSalary;
    private SkillSet requiredSkills;
    private VacancyType type;

    public Vacancy(String title, int minSalary, int maxSalary, SkillSet requiredSkills, VacancyType type) {
        this.title = title;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.requiredSkills = requiredSkills;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public SkillSet getRequiredSkills() {
        return requiredSkills;
    }

    public VacancyType getType() {
        return type;
    }
}
