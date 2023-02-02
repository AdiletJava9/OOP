import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.group = "Java";
//        student.name = "Samat";
//        student.age = 34;
//        Student student1 = new Student();
//        student1.group = "Java";
//        student1.name = "Malik";
//        student1.age = 18;
//        Student student2 = new Student();
//        student2.group = "Js";
//        student2.name = "Name";
//        student2.age = 17;
//        Student student3 = new Student();
//        student3.group = "Js";
//        student3.name = "Azim";
//        student3.age = 21;
//        Student student4 = new Student();
//        student4.group = "Java";
//        student4.name = "Adilet";
//        student4.age = 22;
//        Student[] massive = new Student[]{student, student1, student2, student3, student4};
//        int counter = 0;
//        int counter1 = 0;
//int counter2=0;
//        for (Student a : massive) {
//            if (a.group.equals("Java")) {
//                counter++;
//
//            } else if (a.group.equals("Js")) {
//                counter1++;
//            }
//        }
//        System.out.println("Java Students:" + counter);
//        System.out.println("Js students:" + counter1);
//        for (Student a : massive) {
//            counter=counter + a.age;
//            counter2++;
//        }
//        System.out.println(counter/ massive.length);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ВВЕДИТЕ ПИН КОД:");
            int parol = scanner.nextInt();
            if (parol == 6567) {
                Accaunt accaunt = new Accaunt();
                accaunt.typekarta = "VISA";
                accaunt.numberkarta = 654765473;
                accaunt.balance=1000;
                System.out.println(accaunt.typekarta);
                System.out.println("НОМЕР КАРТЫ:" + accaunt.numberkarta);
                System.out.println("У ВАС НА СЧЕТУ:" + accaunt.balance);
                System.out.println(accaunt.balance + "-"+ accaunt.withdrawal(500));
                System.out.println(accaunt.balance + "+"+ accaunt.deposit(786));
                System.out.println("balance is : " + accaunt.balance);
            } else {
                System.out.println("НЕ ПРАВИЛЬНО");
            }
    }

    }
}