
package btvn1209;

import java.util.Scanner;

public class Btvn1209 {

      public static void inmang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "\t");
        }
    }
//    public static void cau1(int a[], int n, int k, int x) {
//        
//        for (int i = n; i>=k; i--) {
//            a[i]=a[i-1];
//        }
//        a[k]=x;
//        n++;
//        
//    }
      public static void cau2(String[] args) {
        
    }
    
    public static void main(String[] args) {
        int k,x;
        int n;
      
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap sl phan tu cua mang:");
        n=sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
//        System.out.println("nhap so muon chen:");
//        x=sc.nextInt();
//        System.out.println("nhap vi tri muon chen:");
//        k=sc.nextInt();
//        cau1(a,n,k,x);
//        System.out.println("mang sau khi chen:");
//        inmang(a,n);
        // TODO code application logic here
    }
    
}
