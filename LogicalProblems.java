import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LogicalProblems {

    public List<Employee> createEmployee() {
        Employee e1 = new Employee(1, "Employee1", 25, "Male", Arrays.asList("HR", "IT"),
                2017, 30000.00);
        Employee e2 = new Employee(1, "Employee2", 29, "Male", Arrays.asList("Sales", "IT"),
                2017, 28000.00);
        Employee e3 = new Employee(1, "Employee3", 23, "female", Arrays.asList("QA", "Sales", "Dev"),
                2017, 32000.00);
        Employee e4 = new Employee(1, "Employee4", 25, "female", Arrays.asList("IT", "QA", "DBA"),
                2017, 41000.00);
        Employee e5 = new Employee(1, "Employee5", 42, "Male", Arrays.asList("HR", "Sales"),
                2017, 24000.00);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        return employeeList;
    }

    // find the employee from HR department
    public List<Employee> employeeByHR(List<Employee> employees, String department) {
        List<Employee> emps = employees.stream().filter(e-> e.getDepartment().stream().anyMatch(dept ->dept.equals(department))).collect(Collectors.toList());
        System.out.println(emps);
        return emps;
    }

    public List<Employee> employeesTopTwoSalary(List<Employee> employees) {
        List<Employee> emps = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList());
        System.out.println(emps);
        return emps;
    }

    public List<Employee> sortOnAge(List<Employee> employees) {
        List<Employee> emps = employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println(emps);
        return emps;
    }


}
