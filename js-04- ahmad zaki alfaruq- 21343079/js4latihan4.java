/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class js4latihan4 {
    public static void main(String[]args){
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demonstrasi !!
        test = (i<j) && (j++ < 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi !
        test = (i<j) & (j++ < 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
