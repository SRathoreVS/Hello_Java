package airthmaticOps;

public class Airthmatic {
    public static void main(String[] args) {
        int totalSalary = 1000;
        int bonus = 500;
        int totalMoney = totalSalary + bonus ;
        System.out.println(totalMoney);

        int yearlyTotal = totalMoney * 12;
        System.out.println(yearlyTotal);

        int totalPerChild = yearlyTotal / 3;
        System.out.println(totalPerChild);

        int a = 5;
        int b = 2;
//        remainder
        System.out.println(a % b);
    }
}
