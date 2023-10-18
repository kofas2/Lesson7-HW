package ru.geekbrains.lesson7.observer;

public class Student implements Observer {
    private String name;
    private int salary = 2000;
    private Vacancy currentVacancy = null;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary) {
            if (vacancy != null) {
                if (currentVacancy == null) {
                    System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                            name, nameCompany, vacancy.getTitle(), salary);
                    this.salary = salary;
                    currentVacancy = vacancy;
                } else {
                    if (salary > this.salary && vacancy.equals(currentVacancy)) {
                        System.out.printf("Студент %s: Условия улучшились! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                                name, nameCompany, vacancy.getTitle(), salary);
                        this.salary = salary;
                    } else {
                        System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                                name, nameCompany, vacancy.getTitle(), salary);
                    }
                }
            }
        }
    }
}
