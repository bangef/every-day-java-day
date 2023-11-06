package learn.inner_class;

import learn.inner_class.Company.Employee;

public class CompanyApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Different Creative");

    Employee employee = company.new Employee();
    employee.setName("Budi Sudarsono");

    System.out.println(employee.getCompany());
    System.out.println(employee.getName());
  }
}