public class Employee {
    private String name;
    private int wage;
    private String skill;

    public Employee() {
        this.name = "";
        this.wage = 0;
        this.skill = "";
    }

    public Employee(String name, int wage, String skill) {
        this.name = name;
        this.wage = wage;
        this.skill = skill;
    }

    public String getName() {
        return this.name;
    }

    public int getWage() {
        return this.wage;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void display() {
        System.out.println("Name: " + this.name + "\tWage: " + this.wage + "\tSkill: " + this.skill);
    }
}
