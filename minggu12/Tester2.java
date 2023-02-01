package minggu12;
public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee(400, "Dedik");
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        Employee e;
        e = pEmp;
//        e = iEmp;
        System.out.println(e.getEmployeeInfo());
        System.out.println("-------------------");
        System.out.println(pEmp.getEmployeeInfo());
    }
}