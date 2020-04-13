/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class Quanlysinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement a = new StudentManagement();
        while (true) {
            System.out.println("1.Add \n 2.Change \n 3.Delelte \n 4.Show \n 5.Find \n 6.Sap xep tong diem 3 mon \n 7.Ket thuc ");
            int input;
            input = sc.nextInt();
            switch (input) {
                case 1:
                    Student b = new Student();
                    b.input();
                    if (a.add(b)) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Fail");
                    }
                    break;

                case 2:
                    System.out.println("Nhap MSSV ban muon sua: ");
                    String c = new String();
                    c = sc.next();
                    a.change(c);
                    break;

                case 3:
                    System.out.println("Nhap MSSV ban muon xoa: ");
                    String d = new String();
                    d = sc.next();
                    if (a.delete(d)) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Fail");
                    }
                    break;

                case 4:
                    a.show();
                    break;

                case 5:
                    System.out.println("nhap MSSV muon tim: ");
                    String f = sc.next();
                    if (a.find(f)) {
                        System.out.println(" ");
                    } else {
                        System.out.println("Khong tim thay thong tin sinh vien");
                    }

                case 6:
                    a.arrange();
                    break;

                case 7:
                    return;
            }
        }
    }
}
