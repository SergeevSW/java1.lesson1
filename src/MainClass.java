/**
 * Created by ssergeev on 22.04.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(abcd(6f,4f,10f,5f));
        System.out.println("---------");
        System.out.println(betw1020(5,4));
        System.out.println(betw1020(5,14));
        System.out.println(betw1020(15,14));
        System.out.println("---------");
        System.out.println(checkyear(1900));
        System.out.println(checkyear(2000));
        System.out.println(checkyear(2004));
    }
//  Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.
    public static double abcd(float a,float b,float c,float d) {
        double res = 0;
        if (d == 0){
            res = 0;
        }
        else {
            res = a * (b + (c / d));
        }
    return res;
    }
//  Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true, в противном случае – false.
    public static boolean betw1020(int a, int b){
        if (((a + b) < 20) && ((a + b) > 10)) {
            return true;
        }
        else {
            return false;
        }

    }
//  Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean checkyear(int a) {
        if (((a % 4) == 0) && (((a % 100) != 0)) || ((a % 400) == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

}

