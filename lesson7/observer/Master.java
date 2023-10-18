package ru.geekbrains.lesson7.observer;

public class Master implements Observer {
    private String name;
    private int salary = 80000;
    private Vacancy currentVacancy = null;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary) {
            if (vacancy != null) {
                if (currentVacancy == null) {
                    System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                            name, nameCompany, vacancy.getTitle(), salary);
                    this.salary = salary;
                    currentVacancy = vacancy;
                } else {
                    if (salary > this.salary && vacancy.equals(currentVacancy)) {
                        System.out.printf("Специалист %s: Условия улучшились! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                                name, nameCompany, vacancy.getTitle(), salary);
                        this.salary = salary;
                    } else {
                        System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                                name, nameCompany, vacancy.getTitle(), salary);
                    }
                }
            }
        }
    }
}
