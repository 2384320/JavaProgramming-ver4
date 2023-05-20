public class Student {
    private int number;
    private double grade;
    private String name, department;

    public Student(String name, String department, int number, double grade) {
        this.name = name;
        this.department = department;
        this.number = number;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getNumber() {
        return number;
    }
    public double getGrade() {
        return grade;
    }
}
