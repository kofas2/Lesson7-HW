package ru.geekbrains.lesson7.observer;

import java.util.Random;
import java.util.List;

public class Company {
    private Random random = new Random();
    private String name;
    private Publisher jobAgency;

    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Vacancy vacancy) {
        int salary = random.nextInt(vacancy.getMaxSalary() - vacancy.getMinSalary() + 1) + vacancy.getMinSalary();
        if (vacancy.getRequiredSkills().hasSkills(new SkillSet(List.of("Java", "Spring", "Hibernate")))) {
            jobAgency.sendOffer(name, salary, vacancy);
        }
    }
}

