
package contructorlthdt;

import java.util.ArrayList;
import java.util.Scanner;


public class ContructorLTHDT {

  
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Nhập sl sinh viên:");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<constructor> sv = new ArrayList<>();
       
        for (int i = 0; i < 3; i++) {
            constructor dtu=new constructor();
            System.out.println("nhập tên sv thứ "+(i+1)+":"); 
            dtu.setName(sc.nextLine());
            System.out.println("nhập tuổi sv thứ "+(i+1)+":");
            dtu.setAge(sc.nextInt());
            sc.nextLine();
            System.out.println("nhập đc sv thứ "+(i+1)+":");
            dtu.setAddress(sc.nextLine());
            sv.add(dtu);
        }
        
        
    }
    
}
