package soal3;

public class Employee {
    int id;
    String firstname;
    String lastname;
    int salary;

    Employee(int id, String firstname, String lastname, int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {this.salary = salary;}

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    public String toString() {
        return "Employee[id=" + this.getID() + ",name=" + this.getName() + ",salary=" + this.getSalary() + "]";
    }
}
