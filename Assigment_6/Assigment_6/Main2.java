package Assigment_6;

public class Main2
{
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new CommissionEmployee("miriam", "Abraha", "14675", 65600, 4),
                new HourlyEmployee("abel", "hadish", "90875", 18, 12),
                new SalariedEmployee("sara", "Ztya", "45677", 1500),
                new BasePlusCommissionEmployee("saty", "Amik", "56435", 8000, 5, 1000),
                new SalariedEmployee("Asmwerwa", "Hery", "36789", 1400)
        };

        //Invoking totalSalaries() method
        totalSalaries(employees);
    }

    //totalSalaries() method
    public static void totalSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee emp : employees) {
            sum += emp.getPayment();
            System.out.println(emp.toString());
        }
        System.out.println("Sum of All Salaries : " + sum);
    }

}
