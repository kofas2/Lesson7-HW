package ru.geekbrains.lesson7.observer;

import java.util.List;

public class SkillSet {
    private List<String> skills;

    public SkillSet(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return String.join(", ", skills);
    }
    public boolean hasSkills(SkillSet requiredSkills) {
        for (String skill : requiredSkills.skills) {
            if (!hasSkill(skill)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasSkill(String skill) {
        for (String s : skills) {
            if (s.equals(skill)) {
                return true;
            }
        }
        return false;
    }
}
