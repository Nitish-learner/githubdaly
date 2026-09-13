class Student {

    private String name;
    private String skill;
    private String level;

    Student(String name, String skill, String level) {
        this.name = name;
        this.skill = skill;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevel() {
        return level;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Skill: " + skill);
        System.out.println("Skill Level: " + level);
    }
}

public class StudentSkillTracker {

    public static void main(String[] args) {

        Student s1 = new Student("Nitish", "Java", "Intermediate");
Student s2 = new Student("Nitish", "SQL", "Beginner");
Student s3 = new Student("Nitish", "GitHub", "Intermediate");

s1.display();
s2.display();
s3.display();
    }
}