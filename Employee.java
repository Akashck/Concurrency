import java.util.List;

public class Employee {


    int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                '}';
    }

    String name;
    int age;
    String gender;
    List<String> department;
    int joiningDate;
    double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getDepartment() {
        return department;
    }

    public void setDepartment(List<String> department) {
        this.department = department;
    }

    public int getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(int joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, String gender, List<String> department,
                    int joiningDate, double salary) {
        this.id = id;
        this.age = age;
        this.department = department;
        this.gender = gender;
        this.name= name;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }
    public void setId(int id) {
        this.id = id;
    }
}
