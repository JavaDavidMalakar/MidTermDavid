//done
package design;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args)throws java.lang.Exception, NullPointerException {
        String mission = "You Live, We Float.";
        String vision = "We want to contribute for the betterment of economy of the country.";

        EmployeeInfo employeeInfo1 = new EmployeeInfo("Kelly Prime", 222100);
        EmployeeInfo employeeInfo2 = new EmployeeInfo("John Murphy", 222101);
        EmployeeInfo employeeInfo3 = new EmployeeInfo("Clark Griffin", 222102);
        EmployeeInfo employeeInfo4 = new EmployeeInfo("Belamy Blake", 222103);
        EmployeeInfo employeeInfo5 = new EmployeeInfo("Marcus Kane", 222104);

        employeeInfo1.assignDepartment("Research & Development");
        employeeInfo2.assignDepartment("Information Technology");
        employeeInfo3.assignDepartment("Account & Finance");
        employeeInfo4.assignDepartment("Manufacturing & Import");
        employeeInfo5.assignDepartment("Sales & Marketing");

        employeeInfo1.setSalary(10000);
        employeeInfo1.calculateSalary(employeeInfo1.getSalary());
        employeeInfo2.setSalary(12000);
        employeeInfo2.calculateSalary(employeeInfo2.getSalary());
        employeeInfo3.setSalary(10000);
        employeeInfo3.calculateSalary(employeeInfo3.getSalary());
        employeeInfo4.setSalary(1100);
        employeeInfo4.calculateSalary(employeeInfo4.getSalary());
        employeeInfo5.setSalary(11000);
        employeeInfo5.calculateSalary(employeeInfo5.getSalary());

        employeeInfo1.describeCompany();
        employeeInfo1.describeCompany(mission, vision);

        employeeInfo1.setPerformance(5);
        double bonus222100 = employeeInfo1.calculateEmployeeBonus(employeeInfo1.getSalary(), employeeInfo1.getPerformance());
        employeeInfo2.setPerformance(4);
        double bonus222101 = employeeInfo2.calculateEmployeeBonus(employeeInfo2.getSalary(), employeeInfo2.getPerformance());
        employeeInfo3.setPerformance(3);
        double bonus222102 = employeeInfo3.calculateEmployeeBonus(employeeInfo3.getSalary(), employeeInfo3.getPerformance());
        employeeInfo4.setPerformance(2);
        double bonus222103 = employeeInfo4.calculateEmployeeBonus(employeeInfo4.getSalary(), employeeInfo4.getPerformance());
        employeeInfo5.setPerformance(1);
        double bonus222104 = employeeInfo4.calculateEmployeeBonus(employeeInfo5.getSalary(), employeeInfo5.getPerformance());

        EmployeeInfo.calculateEmployeePension(employeeInfo1.getSalary());
        EmployeeInfo.calculateEmployeeBonus(employeeInfo1.getSalary(),employeeInfo1.getPerformance());

        Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
        List<Object> employeeRecord222100 = new ArrayList<Object>();
        employeeRecord222100.add(employeeInfo1.employeeName());
        employeeRecord222100.add(employeeInfo1.employeeId());
        employeeRecord222100.add(bonus222100);

        List<Object> employeeRecord222101 = new ArrayList<Object>();
        employeeRecord222101.add(employeeInfo2.employeeName());
        employeeRecord222101.add(employeeInfo2.employeeId());
        employeeRecord222101.add(bonus222101);

        employeeInfo.put(222100, employeeRecord222100);
        employeeInfo.put(222101, employeeRecord222101);

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        connectToSqlDB.createTableFromStringToMySql("employee_record", "employee_id", "employee_info");


        for (Integer obj : employeeInfo.keySet()) {
            for (Object obj1 : employeeInfo.get(obj)) {
                //System.out.println(obj1);
                List<String> list1 = new ArrayList<>();
                list1.add(obj.toString());
                list1.add(obj.toString());
                connectToSqlDB.InsertDataFromArrayListToMySql(list1, "employee_id", "employee_info");
            }
        }

        System.out.println("Reading from database");
        List<String> empRec = connectToSqlDB.readDataBase("employee_record", "employee_id", "employee_info");
        for (String emp : empRec) {
            System.out.println(emp);

    }

}
}
