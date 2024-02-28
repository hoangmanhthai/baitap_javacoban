/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.hoc;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author acaivippro
 */
public class javacoban {

    private static int nhap1;

    public static void main(String[] args) {
        baitap5();
    }

    public static void baitap1() {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap vao so nguyen bat ki: ");
        nhap1 = input.nextInt();
        if (nhap1 <= 0) {
            System.out.println("so ban vua nhap la so nguyen am");
        } else {
            System.out.println("so ban vua nhap la so nguyen duong");
        }
    }

    public static void baitap2() {
        String Output;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so bat ki tư 0 den 9: ");
        nhap1 = input.nextInt();
        switch (nhap1) {
            case 0:
                Output = "khong";
                break;
            case 1:
                Output = "mot";
                break;
            case 2:
                Output = "hai";
                break;
            case 3:
                Output = "ba";
                break;
            case 4:
                Output = "bon";
                break;
            case 5:
                Output = "nam";
                break;
            case 6:
                Output = "sau";
                break;
            case 7:
                Output = "bay";
                break;
            case 8:
                Output = "tam";
                break;
            case 9:
                Output = "chin";
                break;
            default:
                Output = "khong chap nhan so nguyen am";
                break;
        }
        System.out.println("so nhap vao: " + nhap1);
        System.out.println("doc bang chu: " + Output);
    }

    public static void baitap3() {
        int canh1, canh2, canh3;

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap canh so 1: ");
        canh1 = input.nextInt();
        System.out.print("Nhap canh so 2: ");
        canh2 = input.nextInt();
        System.out.print("Nhap canh so 3: ");
        canh3 = input.nextInt();
        if ((canh1 + canh2 > canh3 && canh2 + canh3 > canh1 && canh3 + canh1 > canh2) && (canh1 > 0 && canh2 > 0 && canh3 > 0)) {
            if ((canh1 == canh2) && (canh2 == canh3)) {
                System.out.println("day la hinh tam giac deu");
            }
        } else {
            System.out.println("3 canh ban vua nhap khong phai hinh tam giac");
        }
    }

    public static void baitap4() {
        int a, b, c;
        Scanner d = new Scanner(System.in);
        System.out.print("nhap canh a: ");
        a = d.nextInt();
        System.out.print("nhap canh b: ");
        b = d.nextInt();
        System.out.print("nhap canh c: ");
        c = d.nextInt();
        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            System.out.println("day la tam giac vuong");
        } else {
            System.out.println("khong phai tam giac vuong");
        }
    }

    public static void baitap5() {
        String masosv;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien: ");
        masosv = input.next();
        Pattern pattern = Pattern.compile("^B\\d{7}$");
        Matcher matcher = pattern.matcher(masosv);
        if (!matcher.find()) {
            System.out.println("ma so sinh vien khong dung dinh dang");
        } else {
            System.out.println(masosv);
            System.out.println("ma so vua nhap: " + masosv);
        }
    }

    public static void baitap6() {
        int songuyen;
        List sochan = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so nguyen bat ki: ");
        songuyen = input.nextInt();
        for (int i = 0; i <= songuyen; i++) {
            if (i % 2 == 0) {
                sochan.add(i);
            }
        }
        System.out.println("cac so chan: " + sochan);
        System.out.println("tong co so chan co: " + sochan.size());
    }

    public static void baitap7() {
        int songuyen;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so bat ki: ");
        songuyen = input.nextInt();
        for (int i = 1; i <= 20; i++) {
            int ketqua = songuyen * i;
            System.out.println("phep tinh: " + songuyen + " * " + i + " = " + ketqua);
        }
    }

    public static void baitap8() {
        int songuyen;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so bat ki < 1000: ");
        songuyen = input.nextInt();
        for (int i = 0; i < songuyen; i++) {
            System.out.println(i);
        }
    }

    public static void baitap9() {
        String masosv;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien: ");
        masosv = input.next();
        Pattern pattern = Pattern.compile("^B170\\d{4}$");
        Matcher matcher = pattern.matcher(masosv);
         if (!matcher.find()) {
            System.out.println("ma so sinh vien khong dung dinh dang");
        } else {
            System.out.println("ma so vua nhap: " + masosv);
        }
    }
}
