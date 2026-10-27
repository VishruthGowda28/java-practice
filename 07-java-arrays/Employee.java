public class Employee {
    public int emp_id;
    public String emp_name;

    Employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee(101, "Vishruth");
        emp[1] = new Employee(102, "Raghunandana");
        emp[2] = new Employee(103, "Virat Kohli");
        emp[3] = new Employee(104, "Yashwant");
        emp[4] = new Employee(105, "Sajan");
        // emp[5] = new Employee(106, "PAvan");

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee ID: " + emp[i].emp_id + ", " + "Employee Name: " + emp[i].emp_name);
        }
    }
}