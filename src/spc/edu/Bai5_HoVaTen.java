/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai5_HoVaTen {
    public static void main(String[] args) {
        System.out.println("Chuong trinh QUAN LY SINH VIEN");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        // String hoten = sc.next();
        String hoten = sc.nextLine();
        
        System.out.print("Nhap nam sinh cua ban: ");
        int namsinh = sc.nextInt();
        
        
        System.out.println("Chao ban " + hoten);
        int tuoi = 2024 -namsinh;
        System.out.println("Tuoi cua ban la " + tuoi);        
        
    }
}
