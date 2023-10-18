package ru.geekbrains.lesson7.observer;

public class Middle implements Observer {
    private String name;
    private int minSalary;
    private int maxSalary;

    public Middle(String name, int minSalary, int maxSalary) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (salary >= minSalary && salary <= maxSalary) {
            SkillSet requiredSkills = vacancy.getRequiredSkills();
            String requiredSkillsString = String.join(", ", requiredSkills.getSkills());

            System.out.printf("Middle %s: Мне подходит это предложение! (компания: %s; заработная плата: %d; тип: %s; необходимые навыки: %s)\n",
                    name, nameCompany, salary, vacancy.getType(), requiredSkillsString);
        } else {
            System.out.printf("Middle %s: Это предложение мне не подходит. (компания: %s; заработная плата: %d; тип: %s; необходимые навыки: %s)\n",
                    name, nameCompany, salary, vacancy.getType(), vacancy.getRequiredSkills());
        }
    }
}
