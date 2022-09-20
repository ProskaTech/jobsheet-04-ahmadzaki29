/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class js4tugas2 {
    public static void main(String[] args){
        int x=10;
        int y=23;
        int z=5;
        int a;

        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);

        //mencari nilai dengan operator kondisi
        a=(y>=x)? y:x;
        a=(z>=a)?z:a;
        System.out.println("Nilai tertinggi adalah = "+a);
    }
}
