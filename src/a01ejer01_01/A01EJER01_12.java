/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01ejer01_01;

/**
 *
 * @author MAGD7-PC
 */
public class A01EJER01_12 {
    public static void main(String[] agrs) {

		System.out.println("Miles / (hour + (minutes / 60) + (seconds / 3600)) * 1.6");

		System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");

		System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);

	}
}
