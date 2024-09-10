/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author usr
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] ar = new int[] {20, 14, 10, 0, 4};
        
        int cams = 0;
        
        for (int i = 0; i < ar.length; i++){
            if (ar[i] > 0) {
                cams++;
            }
            System.out.println(cams);
        }
    }
}
