import java.util.Scanner;

public class Main {
    static int[] b;

    static void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        b = new int[n];

        System.out.println("Nhap cac phan tu mang b[]");
        for(int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Nhap du lieu ");
        System.out.println("2. Sap xep ");
        System.out.println("3. Hien thi gia tri mang a ");
        System.out.print("Nhap vao chuc nang 1/2/3: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        EffSort e = new EffSort();

        while (choice == 1 || choice == 2 || choice == 3) {

            System.out.println();

            switch (choice) {
                case 1 -> {
                    input();
                    e = new EffSort(b);
                }
                case 2 -> {e.quickSort();}
                case 3 -> {e.display();}
            }

            System.out.print("Nhap vao chuc nang 1/2/3: ");
            choice = input.nextInt();
        }
    }
}

/*
7
3
5
9
11
8
6
15
10
12
14
 */

