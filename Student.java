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
public class Student {
    private String MSSV, ten, tuoi;
    int nam, nu;
    private int toan, van, anh;
    
    Scanner sc = new Scanner(System.in);

    public String getMSSV(){
        return MSSV;
    }

    public String getTen(){
        return ten;
    }

    public String getTuoi(){
        return tuoi;
    }

    public void setMSSV(String MSSV){
        this.MSSV = MSSV;
    }

    public void setTen(String ten){
        this.ten = ten;
    }

    public void setTuoi(String tuoi){
        this.tuoi = tuoi;
    }

    public void setNam(int nam){
        this.nam = nam;
    }

    public void setNu(int nu){
        this.nu = nu;
    }

    public void setToan(int toan){
        this.toan = toan;
    }

    public void setVan(int van){
        this.van = van;
    }
    
    public void setAnh(int anh){
        this.anh = anh;
    }

    public int getToan(){
        return toan;
    }

    public int getVan(){
        return van;
    }

    public int getAnh(){
        return anh;
    }
    
    public int tongdiem(){
        return getAnh()+getVan()+getToan();
    }
    
    public void input(){
        System.out.println("Nhap ten sinh vien: ");
        setTen(sc.next());
        System.out.println("Nhap tuoi sinh vien: ");
        setTuoi(sc.next());
        System.out.println("Nhap MSSV");
        setMSSV(sc.next());
        System.out.println("Nhap diem toan van anh: ");
        setToan(sc.nextInt());
        setVan(sc.nextInt());
        setAnh(sc.nextInt());
    }

    public void output(){
        System.out.println("Ten: " +getTen());
        System.out.println("Tuoi: " +getTuoi());
        System.out.println("MSSV: " +getMSSV());
        System.out.println("Diem toan, van, anh: " +tongdiem());
    }
}
