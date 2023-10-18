package ru.geekbrains.lesson7.observer;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company geekBrains = new Company("GeekBrains", jobAgency);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Middle middle1 = new Middle("Middle #1", 100000, 150000);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(middle1);

        SkillSet requiredSkills = new SkillSet(List.of("Java", "Spring", "Hibernate"));
        Vacancy javaDeveloperVacancy = new Vacancy("Java Developer", 100000, 150000, requiredSkills, VacancyType.FULL_TIME);
        google.needEmployee(javaDeveloperVacancy);

        for (int i = 0; i < 3; i++) {
            yandex.needEmployee(null);
            geekBrains.needEmployee(null);
        }
    }
}