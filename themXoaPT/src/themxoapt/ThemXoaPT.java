package themxoapt;

import java.util.Scanner;

public class ThemXoaPT {

    public static void inMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

    public static void nhap(int a[], int n, Scanner s) {

        for (int i = 0; i < n; i++) {
            System.out.print("Pt thu " + (i + 1) + ":");
            a[i] = s.nextInt();
        }
    }

    public static int[] themPT(Scanner s, int a[], int b[]) {
        int x;
        System.out.print("Nhap gt can them:");
        x = s.nextInt();

        for (int i = 0; i < a.length + 1; i++) {
            if (i == a.length) {
                b[i] = x;
            } else {
                b[i] = a[i];
            }
        }
        return b;

    }

    public static int[] updatePhanTu(Scanner s, int d[], int b[]) {
        int vt;

        do {
            System.out.print("Nhap vt can update:");
            vt = s.nextInt();
        } while (vt < 1 || vt > d.length );
        System.out.print("Nhap gt update:");
        int x = s.nextInt();

        for (int i = 0; i < d.length; i++) {
            if (i == vt - 1) {
                b[i] = x;
            } else {
                b[i] = d[i];
            }
        }
        return b;
    }
    public static int [] deletePhanTu(Scanner s,int []update,int []xoa,int []xoa1){
        int vtdelete;
        do {
            System.out.print("Nhap vt can delete:");
            vtdelete=s.nextInt();
            
        } while (vtdelete<1|| vtdelete>update.length);
        
        for (int i = 0; i < update.length; i++) {
            if (i!=vtdelete-1) {
                xoa[i]=update[i];
            }
        }
        for (int i = 0; i < xoa.length; i++) {
            if (xoa[i]!=0) {
                xoa1[i]=xoa[i];
            }
        }
        return xoa1;
    }

    public static int dauLeDauTien(int n) {

        while (n >= 10) {
            n = n / 10;
        }
        if (n % 2 == 1) {
            return 1;
        }
        return 0;
    }

    public static void gTLeDauTien(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (dauLeDauTien(a[i]) == 1) {
                System.out.println("GT dau le dau tien trong mang la :" + a[i]);
                break;

            }
        }
    }

    public static void sapXep(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static int timVTLNN(int n, int a[]) {
        sapXep(n, a);
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] % 2 == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void timChanMaxNhoHonMin(int n, int a[]) {
        int vtlnn = timVTLNN(n, a);
        for (int i = vtlnn + 1; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("GT chan max nho hon all so le: " + a[i]);
                break;
            }
        }
    }

    public static void cacGTThuocDoan(int n, int a[], Scanner s) {
        int x, y;
        System.out.print("Nhap doan x:");
        x = s.nextInt();
        System.out.print("Nhap doan y:");
        y = s.nextInt();
        System.out.println("Cac gt thuoc doan[" + x + ";" + y + "] la:");
        for (int i = 0; i < n; i++) {
            if (a[i] >= x && a[i] <= y) {
                System.out.println(a[i] + "\t");
            }
        }
    }

    public static void demSLGT(int n, int a[]) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 10 == 5) {
                sum++;
            }
        }
        System.out.println("SLGT co chu so tan cung la 5: " + sum);
    }

    public static void cacGTXH1Lan(int n, int a[]) {
        System.out.println("GT XH 1 lan trong mang:");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    sum++;
                }

            }

            if (sum == 1) {

                System.out.print(a[i] + "\t");
            }

        }

    }

    public static void SLGTXH1LanTrong2Mang(int a[], int b[], int n, int nb) {
        int temp, d = 0;
        for (int i = 0; i < n; i++) {
            temp = 1;
            for (int j = 0; j < nb; j++) {
                if (a[i] == b[j]) {
                    temp = 0;

                }
            }
            if (temp == 1) {
                d++;
            }
        }
        for (int i = 0; i < nb; i++) {
            temp = 1;
            for (int j = 0; j < n; j++) {
                if (b[i] == a[j]) {
                    temp = 0;
                }
            }
            if (temp == 1) {
                d++;
            }
        }
        System.out.println("Sl GT Xh chi xh 1 trong 2 mang la:" + d);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap sl pt trong mang:");
        n = s.nextInt();
        int a[] = new int[n];
        int[] update = new int[n];
        int[] xoa = new int[n];
        int[] xoa1 = new int[n - 1];
        int[] them = new int[n + 1];

        nhap(a, n, s);
        updatePhanTu(s, a, update);
        inMang(update);
        deletePhanTu(s, update, xoa,xoa1);
        inMang(xoa1);
//      themPT(s, a,d);
//        inMang( d);  

//        inMang(n, a);
//        xoaPT(a,n,s);
//        inMang(n, a);
//        gTLeDauTien(a, n);
//        timChanMaxNhoHonMin(n, a);
//        cacGTThuocDoan(n, a, s);
//        demSLGT(n, a);
//        cacGTXH1Lan(n, a);
//        System.out.println("\nNhap sl mang b:");
//        int nb = s.nextInt();
//        int b[] = new int[nb];
//        nhap(b, nb, s);
//        SLGTXH1LanTrong2Mang(a, b, n, nb);
    }
}
