package studens;

import java.util.Scanner;

public class Studens {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        classStudens hs1 = new classStudens();
        hs1.name = "loi";
        hs1.age = 20;
        hs1.classs = "DTU";
        hs1.address = "QN";
        classStudens hs2 = new classStudens();
        hs2.name = "Nhi";
        hs2.age = 20;
        hs2.classs = "DTU";
        hs2.address = "QN";
        classStudens hs3 = new classStudens();
        hs3.name = "An";
        hs3.age = 19;
        hs3.classs = "DTT";
        hs3.address = "QN";
        classStudens hs4 = new classStudens();
        hs4.name = "Quoc";
        hs4.age = 25;
        hs4.classs = "TTU";
        hs4.address = "HD";
        //tạo 4 đối tượng student với thông tin nhập từ bàn phím
        classStudens[] studen = new classStudens[4];
        for (int i = 0; i < studen.length; i++) {
            classStudens stu = new classStudens();
            System.out.print("Nhap ten studen thu "+(i+1)+":");
            stu.name = s.nextLine();
            System.out.print("Nhap tuoi studen thu "+(i+1)+":");
            stu.age = s.nextInt();
            System.out.print("Nhap lop studen thu "+(i+1)+":");
            stu.classs = s.nextLine();
            System.out.print("Nhap dia chi studen thu "+(i+1)+":");
            stu.address = s.nextLine();
            studen[i] = stu;
        }
        for (int i = 0; i < studen.length; i++) {
            System.out.println("Studens thu " + (i + 1) + ":");
            System.out.println("Name:" + studen[i].name);
            System.out.println("Age:" + studen[i].age);
            System.out.println("Class:" + studen[i].classs);
            System.out.println("Address:" + studen[i].address);

        }

    }

}
