package sortVideo;

public class Employee implements Comparable<Employee> {


    private String name;
    private String phoneNumber;
    private Integer empId;


    public Employee(String name, String phoneNumber, int empId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.empId = empId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }


    @Override
    public int compareTo(Employee o) {
        return this.getEmpId() - o.getEmpId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", empId=" + empId +
                '}';
    }

}
