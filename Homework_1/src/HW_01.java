public class HW_01 {
// Плотникова Алёна
// Домашнее задание к 1 уроку "Java. Уровень первый."

    public static void main(String[] args) {
        System.out.println("Exercise_1.");
        System.out.println("Создать пустой проект в IntelliJ IDEA и прописать метод main()");
        System.out.println("");
        System.out.println("Сделано.");
        System.out.println("");
        Exercise_2();
        System.out.println("a * (b + (c / d)) = " + Exercise_3(5,8,15,3));
        System.out.println(Exercise_4(20, 15));
        Exercise_5(56);
        System.out.println(Exercise_6(8));
        Exercise_7("Андрей");
        Exercise_8(2020);
    }

    static void Exercise_2() {
        System.out.println("Exersize_2.");
        System.out.println("Создать переменные всех пройденных типов данных, и инициализировать их значения.");
        System.out.println("");
        byte B = -100;
        System.out.println("Тип byte = " + B);
        short Sh = -666;
        System.out.println("Тип short = " + Sh);
        int I = 2019;
        System.out.println("Тип int = " + I);
        long L = 65665959L;
        System.out.println("Тип long = " + L);
        float Fl = 18.15f;
        System.out.println("Тип float = " + Fl);
        double D = 985.985;
        System.out.println("Тип double = " + D);
        char Ch = '\u0033';
        System.out.println("Тип char = [" + Ch + "]");
        boolean Boo = true;
        System.out.println("Тип boolean = " + Boo);

    }

    static double Exercise_3(double a, double b, double c, double d) {
        System.out.println("");
        System.out.println("Exercise_3.");
        System.out.println("Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода");
        System.out.println("");
        return a * (b + (c / d));
    }

        static boolean Exercise_4(int a, int b) {
        System.out.println("");
        System.out.println("Exercise_4.");
        System.out.println(" Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false.");
        System.out.println("");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void Exercise_5(int a) {
        System.out.println("");
        System.out.println("Exercise_5.");
        System.out.println("Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.");
        System.out.println("");
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    //5 - 6. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    static boolean Exercise_6(int a) {
        System.out.println("");
        System.out.println("Exercise_6.");
        System.out.println("Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное.");
        System.out.println("");
        if (a < 0) return true;
        return false;
    }

    static void Exercise_7(String name) {
        System.out.println("");
        System.out.println("Exercise_7.");
        System.out.println("Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!».");
        System.out.println("");
        System.out.println("Привет, " + name + "!");
    }

    static void Exercise_8(int year) {
        System.out.println("");
        System.out.println("Exercise_8.");
        System.out.println("Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.");
        System.out.println("");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else
            System.out.println(year + " г. високосный");
    }
}